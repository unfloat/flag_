package com.flag.flag.presentation.ui.fragments.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.flag.flag.R;

public class GallerieFragment extends Fragment {

    private String title;
    private int page;

    public static GallerieFragment newInstance(int page, String title) {
        GallerieFragment gallerieFragment = new GallerieFragment();
        Bundle args = new Bundle();
        args.putInt("2", page);
        args.putString("Gallerie", title);
        gallerieFragment.setArguments(args);
        return gallerieFragment;
    }

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.progile_gallerie_fragment, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("2", 0);
        title = getArguments().getString("Gallerie");
    }
}

