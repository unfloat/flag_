package com.flag.flag.presentation.ui.fragments.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.flag.flag.R;

public class InfoPersoFragment extends Fragment {

    private String title;
    private int page;

    public static InfoPersoFragment newInstance(int page, String title) {
        InfoPersoFragment infoPersoFragment = new InfoPersoFragment();
        Bundle args = new Bundle();
        args.putInt("0", page);
        args.putString("Info Perso", title);
        infoPersoFragment.setArguments(args);
        return infoPersoFragment;
    }

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.profile_info_perso_fragement, container, false);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("0", 0);
        title = getArguments().getString("Info Perso");
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

}