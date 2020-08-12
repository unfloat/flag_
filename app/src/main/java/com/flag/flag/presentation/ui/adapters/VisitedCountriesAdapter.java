package com.flag.flag.presentation.ui.adapters;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.flag.flag.presentation.model.VisitedCountries;
import com.flag.flag.presentation.ui.listeners.RecyclerViewClickListener;

import java.util.List;
import java.util.Set;

public class VisitedCountriesAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements RecyclerViewClickListener {

    private List<VisitedCountries> mCostList;
    private Context mContext;

    private Set<Integer> mSelectedItems;
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public void onClickView(int position) {

    }

    @Override
    public void onClickEdit(int position, long costId) {

    }

    @Override
    public void onClickDelete(int position, long costId) {

    }
}
