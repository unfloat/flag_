package com.flag.flag.network.converters;

import com.flag.flag.domain.model.Cost;
import com.flag.flag.network.model.RESTCost;

import java.util.Date;

/**
 * Created by dmilicic on 2/14/16.
 */
public class RESTModelConverter {

    public static RESTCost convertToRestModel(Cost cost) {

        String desc = cost.getDescription();
        double amount = cost.getAmount();
        String category = cost.getCategory();
        Date date = cost.getDate();
        long id = cost.getId();

        return new RESTCost(id, category, desc, date, amount);
    }
}
