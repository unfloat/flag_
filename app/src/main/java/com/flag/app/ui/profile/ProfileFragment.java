package com.flag.app.ui.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.flag.app.R;
import com.flag.app.adapters.ProfileTabbedFragmentsAdapter;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfileFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileFragment extends Fragment {

    ProfileTabbedFragmentsAdapter adapter;
    ViewPager2 viewPager;
    TabLayout tabLayout;
    TabItem tabInfo, tabCountries, tabGallery;


    public ProfileFragment() {
        // Required empty public constructor
    }

    public static ProfileFragment newInstance() {
        ProfileFragment fragment = new ProfileFragment();
        Bundle args = new Bundle();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        tabLayout = view.findViewById(R.id.tab_layout);
        tabInfo = view.findViewById(R.id.infoPersoTabItem);
        tabCountries = view.findViewById(R.id.visitedCountriesTabItem);
        tabGallery = view.findViewById(R.id.gallerieTabItem);
        adapter = new ProfileTabbedFragmentsAdapter(this);
        adapter.createFragment( 0);
        adapter.createFragment( 1 );
        adapter.createFragment( 2);


        viewPager = view.findViewById(R.id.pager);
        // Inflate the layout for this fragment
        //setupViewPager(viewPager);
        return view;

    }

    /*
    private void setupViewPager(ViewPager2 viewPager) {
        ProfileTabbedFragmentsAdapter  adapter = new ProfileTabbedFragmentsAdapter(getChildFragmentManager());
        adapter.addFragment( InfoPersoFragment.newInstance(0,"Info Perso"));
        adapter.addFragment( VisitedCountriesFragment.newInstance(1, "Pays visités") );
        adapter.addFragment( GalleryFragment.newInstance(2, "Gallerie"));
        viewPager.setAdapter(adapter);
    }
     */

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    }
}