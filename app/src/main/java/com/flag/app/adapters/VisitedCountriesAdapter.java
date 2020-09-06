package com.flag.app.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.flag.app.R;
import com.flag.app.model.VisitedCountryModel;
import com.flag.app.viewholders.EventViewHolder;
import com.flag.app.viewholders.VisitedCountryViewHolder;

import java.util.List;

public class VisitedCountriesAdapter extends RecyclerView.Adapter<VisitedCountryViewHolder> {
    private List<VisitedCountryModel> listVisitedCountries;

    public VisitedCountriesAdapter(List<VisitedCountryModel> listVisitedCountries) {
        this.listVisitedCountries = listVisitedCountries;
    }

    @Override
    public int getItemViewType(final int position) {
        return R.layout.list_visited_countries_item;
    }

    @NonNull
    @Override
    public VisitedCountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new VisitedCountryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VisitedCountryViewHolder holder, int position) {
        VisitedCountryModel visitedCountry = listVisitedCountries.get(position);
        holder.getVisitedCountryName().setText(String.valueOf(visitedCountry.getCountryName()));
        holder.getVisitedCountryVisitDate().setText(String.valueOf(visitedCountry.getCountryVisitDate()));
    }


    @Override
    public int getItemCount() {
        return listVisitedCountries.size();
    }

    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access

}