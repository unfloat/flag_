package com.flag.app.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.flag.app.ui.profile.GalleryFragment;
import com.flag.app.ui.profile.InfoPersoFragment;
import com.flag.app.ui.profile.VisitedCountriesFragment;

import java.util.ArrayList;
import java.util.List;

public class ProfileTabbedFragmentsAdapter extends FragmentStateAdapter {
    private static int NUM_ITEMS = 3;

    private List<Fragment> mFragmentList = new ArrayList<>();

    public ProfileTabbedFragmentsAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }


    public ProfileTabbedFragmentsAdapter(@NonNull FragmentManager fragmentManager, Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }



    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return InfoPersoFragment.newInstance(position, "Info Perso");
            case 1:
                return VisitedCountriesFragment.newInstance(position, "Pays visités");
            case 2:
                return GalleryFragment.newInstance(position, "Gallerie");
            default:
                return null;
        }    }



    @Override
    public int getItemCount() {
        return 3;
    }
}
