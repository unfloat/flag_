package com.flag.flag.domain.interactors;

import com.flag.flag.domain.interactors.base.Interactor;
import com.flag.flag.domain.model.Cost;

/**
 * Created by dmilicic on 12/27/15.
 */
public interface GetCostByIdInteractor extends Interactor {

    interface Callback {
        void onCostRetrieved(Cost cost);

        void noCostFound();
    }
}
