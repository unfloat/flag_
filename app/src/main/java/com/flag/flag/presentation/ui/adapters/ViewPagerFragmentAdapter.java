package com.flag.flag.presentation.ui.adapters;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.flag.flag.presentation.ui.fragments.profile.GallerieFragment;
import com.flag.flag.presentation.ui.fragments.profile.InfoPersoFragment;
import com.flag.flag.presentation.ui.fragments.profile.VisitedCountriesFragment;

import java.util.ArrayList;

public  class ViewPagerFragmentAdapter extends FragmentStateAdapter {
    private static int NUM_ITEMS = 3;
    //private ArrayList<Fragment> arrayList = new ArrayList<>();


    public ViewPagerFragmentAdapter(@NonNull FragmentManager fragmentManager,@NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return null;
    }

    @NonNull
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return InfoPersoFragment.newInstance(0, "Info Perso");
            case 1:
                return  VisitedCountriesFragment.newInstance(1, "Pays Visités");
            case 2:
                return  GallerieFragment.newInstance(2, "Gallerie");
            default:
                return null;
        }
    }

    /*
    public CharSequence getPageTitle(int position) {
        return "Page " + position;
    }
     */

    @Override
    public int getItemCount() {
        return NUM_ITEMS;
    }

}
