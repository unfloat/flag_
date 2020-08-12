package com.flag.flag.domain.interactors;

import com.flag.flag.domain.interactors.base.Interactor;
import com.flag.flag.domain.model.Cost;

import java.util.List;

/**
 * Created by dmilicic on 12/10/15.
 * <p/>
 * This interactor is responsible for retrieving a list of costs from the database.
 */
public interface GetAllCostsInteractor extends Interactor {

    interface Callback {
        void onCostsRetrieved(List<Cost> costList);
    }
}
