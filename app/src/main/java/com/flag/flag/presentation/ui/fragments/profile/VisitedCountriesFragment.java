package com.flag.flag.presentation.ui.fragments.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.flag.flag.R;

public class VisitedCountriesFragment extends Fragment {

    private String title;
    private int page;

    public static VisitedCountriesFragment newInstance(int page, String title) {
        VisitedCountriesFragment visitedCountriesFragment = new VisitedCountriesFragment();
        Bundle args = new Bundle();
        args.putInt("1", page);
        args.putString("Pays Visités", title);
        visitedCountriesFragment.setArguments(args);
        return visitedCountriesFragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("1", 0);
        title = getArguments().getString("Pays Visités");
    }
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_visited_countries, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }
}