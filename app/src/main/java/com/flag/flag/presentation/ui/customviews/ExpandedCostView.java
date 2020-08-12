package com.flag.flag.presentation.ui.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

import com.flag.flag.R;
import com.flag.flag.domain.model.Cost;
import com.flag.flag.presentation.model.DailyTotalCost;
import com.flag.flag.presentation.ui.listeners.IndividualCostViewClickListener;
import com.flag.flag.utils.DateUtils;

import java.util.Date;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by dmilicic on 1/6/16.
 */
public class ExpandedCostView extends CardView {

    @Bind(R.id.cost_item_title)
    TextView mTitle;

    @Bind(R.id.cost_item_total_value)
    TextView mValue;

    @Bind(R.id.layout_individual_cost_items)
    LinearLayout mLinearLayout;

    @Nullable
    private IndividualCostViewClickListener mIndividualCostViewClickListener;

    public ExpandedCostView(Context context) {
        super(context);
        init(context);
    }

    public ExpandedCostView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public ExpandedCostView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.expanded_cost_item, this);

        ButterKnife.bind(this, view);
    }

    public void setIndividualCostViewClickListener(
            @Nullable IndividualCostViewClickListener individualCostViewClickListener) {
        mIndividualCostViewClickListener = individualCostViewClickListener;
    }

    private void addCostItem(Cost cost, int position) {
        CostItemView costView = new CostItemView(getContext(), mIndividualCostViewClickListener, cost);

        // every other cost item will have a different background so its easier on the eyes
        if (position % 2 == 0) {
            costView.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.colorBrightGray));
        }

        mLinearLayout.addView(costView);
    }

    private void setTitle(Date date) {
        final String dateText = DateUtils.dateToText(getContext(), date);
        final String title = String.format(getContext().getString(R.string.total_expenses), dateText);
        mTitle.setText(title);
    }

    private void setTotalValue(double value) {
        String val = String.format("%.2f$", value);
        mValue.setText(val);
    }

    public void setDailyCost(DailyTotalCost dailyCost) {

        // reset the individual cost items
        mLinearLayout.removeAllViews();

        // convert date to text
        setTitle(dailyCost.getDate());

        setTotalValue(dailyCost.getTotalCost());

        // add the individual cost items
        List<Cost> costList = dailyCost.getCostList();
        Cost cost;
        for (int idx = 0; idx < costList.size(); idx++) {
            cost = costList.get(idx);
            addCostItem(cost, idx);
        }
    }
}
