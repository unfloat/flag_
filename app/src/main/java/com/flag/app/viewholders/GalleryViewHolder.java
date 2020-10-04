package com.flag.app.viewholders;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.flag.app.R;
import com.flag.app.ui.profile.SquareImageView;

public class GalleryViewHolder extends RecyclerView.ViewHolder {
    SquareImageView siv;

    public SquareImageView getSiv() {
        return siv;
    }

    public void setSiv(SquareImageView siv) {
        this.siv = siv;
    }

    public GalleryViewHolder(View view) {
        super(view);
        siv = view.findViewById(R.id.siv);
    }
}


