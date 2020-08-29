package com.flag.app.ui.profile;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.flag.app.R;
import com.flag.app.adapters.VisitedCountriesAdapter;
import com.flag.app.model.VisitedCountryModel;

import java.util.ArrayList;
import java.util.Date;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link VisitedCountriesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class VisitedCountriesFragment extends Fragment {

    RecyclerView visitedCountriesRecyclerView;
    ArrayList<VisitedCountryModel> visitedCountriesList;


    public VisitedCountriesFragment() {
        // Required empty public constructor
    }


    public static VisitedCountriesFragment newInstance(int position, String title) {
        VisitedCountriesFragment fragment = new VisitedCountriesFragment();
        Bundle args = new Bundle();
        args.putInt("position", position);
        args.putString("title", title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Date date = new Date("25/12/2010");
        View view = inflater.inflate(R.layout.fragment_visited_countries, container, false);
        visitedCountriesRecyclerView = view.findViewById(R.id.visitedCountriesRecyclerView);
        visitedCountriesList.add(new VisitedCountryModel("Flag", "Country Name", date));
        visitedCountriesList.add(new VisitedCountryModel("Flag", "Country Name1", date));


        // Create adapter passing in the sample user data
        VisitedCountriesAdapter adapter = new VisitedCountriesAdapter(visitedCountriesList);
        // Attach the adapter to the recyclerview to populate items
        visitedCountriesRecyclerView.setAdapter(adapter);
        // Set layout manager to position the items
        visitedCountriesRecyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        // That's all!


        // Inflate the layout for this fragment
        return view;
    }
}