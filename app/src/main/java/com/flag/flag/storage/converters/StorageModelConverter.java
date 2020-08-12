package com.flag.flag.storage.converters;

import com.flag.flag.storage.model.Cost;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by dmilicic on 2/11/16.
 */
public class StorageModelConverter {

    public static Cost convertToStorageModel(com.flag.flag.domain.model.Cost cost) {
        Cost result = new Cost();
        result.setDescription(cost.getDescription());
        result.setAmount(cost.getAmount());
        result.setCategory(cost.getCategory());
        result.setDate(cost.getDate());
        result.setId(cost.getId());

        return result;
    }

    public static com.flag.flag.domain.model.Cost convertToDomainModel(Cost cost) {

        String desc = cost.getDescription();
        double amount = cost.getAmount();
        String category = cost.getCategory();
        Date date = cost.getDate();
        long id = cost.getId();

        com.flag.flag.domain.model.Cost result = new com.flag.flag.domain.model.Cost(
                category,
                desc,
                date,
                amount,
                id
        );

        return result;
    }


    public static List<com.flag.flag.domain.model.Cost> convertListToDomainModel(List<Cost> costs) {
        List<com.flag.flag.domain.model.Cost> convertedCosts = new ArrayList<>();

        for (Cost cost : costs) {
            convertedCosts.add(convertToDomainModel(cost));
        }

        // cleanup
        costs.clear();
        costs = null;

        return convertedCosts;
    }


    public static List<Cost> convertListToStorageModel(List<com.flag.flag.domain.model.Cost> costs) {
        List<Cost> convertedCosts = new ArrayList<>();

        for (com.flag.flag.domain.model.Cost cost : costs) {
            convertedCosts.add(convertToStorageModel(cost));
        }

        // cleanup
        costs.clear();
        costs = null;

        return convertedCosts;
    }
}
