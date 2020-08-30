package com.flag.app.ui.events;

import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.flag.app.R;
import com.flag.app.adapters.EventsAdapter;
import com.flag.app.adapters.VisitedCountriesAdapter;
import com.flag.app.model.Event;
import com.flag.app.model.VisitedCountryModel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListEventsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListEventsFragment extends Fragment {
    RecyclerView eventRecyclerView;
    ArrayList<Event> eventList;

    public ListEventsFragment() {
        // Required empty public constructor
    }

    public static ListEventsFragment newInstance() {
        ListEventsFragment fragment = new ListEventsFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
         */
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_events, container, false);
        // Inflate the layout for this fragment
        eventRecyclerView = view.findViewById(R.id.event_recycler_view);
        eventRecyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        eventList = new ArrayList<Event>();
        eventList.add(new Event("Title", "Organizer Name",10));

        Log.d("eventList",eventList.toString() );
        EventsAdapter adapter = new EventsAdapter(eventList);
        eventRecyclerView.setAdapter(new EventsAdapter(eventList));
        return view;
    }
}