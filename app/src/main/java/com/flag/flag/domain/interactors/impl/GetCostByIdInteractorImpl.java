package com.flag.flag.domain.interactors.impl;

import com.flag.flag.domain.executor.Executor;
import com.flag.flag.domain.executor.MainThread;
import com.flag.flag.domain.interactors.GetCostByIdInteractor;
import com.flag.flag.domain.interactors.base.AbstractInteractor;
import com.flag.flag.domain.model.Cost;
import com.flag.flag.domain.repository.CostRepository;

/**
 * Interactor responsible for getting a single cost item from the database using its ID. It should return the cost item
 * or notify if there isn't one.
 * <p/>
 * Created by dmilicic on 12/27/15.
 */
public class GetCostByIdInteractorImpl extends AbstractInteractor implements GetCostByIdInteractor {

    private long                           mCostId;
    private CostRepository                 mCostRepository;
    private GetCostByIdInteractor.Callback mCallback;


    public GetCostByIdInteractorImpl(Executor threadExecutor, MainThread mainThread, long costId,
                                     CostRepository costRepository,
                                     Callback callback) {
        super(threadExecutor, mainThread);
        mCostId = costId;
        mCostRepository = costRepository;
        mCallback = callback;
    }

    @Override
    public void run() {
        final Cost cost = mCostRepository.getCostById(mCostId);

        if (cost == null) { // we didn't find the cost we were looking for

            // notify this on the main thread
            mMainThread.post(new Runnable() {
                @Override
                public void run() {
                    mCallback.noCostFound();
                }
            });
        } else { // we found it!

            // send it on the main thread
            mMainThread.post(new Runnable() {
                @Override
                public void run() {
                    mCallback.onCostRetrieved(cost);
                }
            });
        }
    }
}
