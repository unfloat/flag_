package com.flag.app.ui.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import com.flag.app.R;
import com.flag.app.adapters.ProfileTabbedFragmentsAdapter;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfileFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileFragment extends Fragment {

    ProfileTabbedFragmentsAdapter adapter;
    ViewPager2 viewPager2;
    TabLayout tabLayout;
    private static final int NUM_PAGES = 3;
    // tab titles
    private String[] titles = new String[]{"Movies", "Events", "Tickets"};

    public ProfileFragment() {
        // Required empty public constructor
    }

    public static ProfileFragment newInstance() {
        return new ProfileFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        viewPager2 = (ViewPager2) view.findViewById(R.id.pager);
        //viewPager2.setOffscreenPageLimit(1);
        final ProfileTabbedFragmentsAdapter adapter = new ProfileTabbedFragmentsAdapter(this);
        adapter.createFragment(0);
        adapter.createFragment(1);
        adapter.createFragment(2);
        viewPager2.setAdapter(adapter);
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position){
                super.onPageSelected(position);
                //adapter.notifyItemChanged(position);
            }
        });
        tabLayout = view.findViewById(R.id.tab_layout);
        //tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


        tabLayout.addTab(tabLayout.newTab().setText("Info Perso"));
        tabLayout.addTab(tabLayout.newTab().setText("Pays visités"));
        tabLayout.addTab(tabLayout.newTab().setText("Gallerie"));
       // tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            FragmentTransaction fragmentTransaction;
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());

            }
        });

        //displaying tabs
        //setupViewPager(viewPager2);

        return view;
    }


    private void setupViewPager(ViewPager2 viewPager) {
        ProfileTabbedFragmentsAdapter adapter = new ProfileTabbedFragmentsAdapter(this);
        adapter.createFragment(0);
        adapter.createFragment(1);
        adapter.createFragment(2);
        /*
        adapter.createFragment(0,"Info Perso");
        adapter.createFragment(1, "Pays visités" );
        adapter.createFragment(2, "Gallerie");
         */
        viewPager.setAdapter(adapter);

    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    }
}