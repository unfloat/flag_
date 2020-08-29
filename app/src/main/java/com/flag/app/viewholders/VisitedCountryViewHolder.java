package com.flag.app.viewholders;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.flag.app.R;

public class VisitedCountryViewHolder extends RecyclerView.ViewHolder {
    public ImageView visitedCountryImage;
    public TextView visitedCountryName, visitedCountryVisitDate;

    public VisitedCountryViewHolder(@NonNull View itemView) {
        super(itemView);
        visitedCountryImage = (ImageView) itemView.findViewById(R.id.visited_country_item_image);
        visitedCountryName = (TextView) itemView.findViewById(R.id.visited_country_item_name);
        visitedCountryVisitDate = (TextView) itemView.findViewById(R.id.visited_country_item_visit_date);
    }




}