package com.flag.flag.domain.interactors;

import com.flag.flag.domain.interactors.base.Interactor;
import com.flag.flag.domain.model.Cost;

/**
 * Created by dmilicic on 12/26/15.
 */
public interface DeleteCostInteractor extends Interactor {

    interface Callback {
        void onCostDeleted(Cost cost);
    }
}
