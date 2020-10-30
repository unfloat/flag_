package com.flag.app.adapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.flag.app.R;
import com.flag.app.viewholders.GalleryViewHolder;
import com.squareup.picasso.Picasso;

import java.util.List;


public class GalleryAdapter extends RecyclerView.Adapter<GalleryViewHolder> {

    private List<String> galleryImagesList;

    public GalleryAdapter(List<String> galleryImagesList) {
        this.galleryImagesList = galleryImagesList;
    }

    @Override
    public int getItemViewType(final int position) {
        return R.layout.gallery_item;
    }


    @NonNull
    @Override
    public GalleryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new GalleryViewHolder(view);    }

    @Override
    public void onBindViewHolder(@NonNull GalleryViewHolder holder, int position) {
            final String path = galleryImagesList.get(position);

            Picasso.get()
                    .load(path)
                    .resize(250, 250)
                    .centerCrop()
                    .into(holder.getSiv());

        Log.d("size", String.valueOf(getItemCount()));

            holder.getSiv().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //handle click event on image
                }
            });
        }

    @Override
    public int getItemCount() {
        return galleryImagesList.size();
    }
}
