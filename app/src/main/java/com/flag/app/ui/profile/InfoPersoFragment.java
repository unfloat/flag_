package com.flag.app.ui.profile;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.flag.app.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InfoPersoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InfoPersoFragment extends Fragment {

    public InfoPersoFragment() {
        // Required empty public constructor
    }

    public static InfoPersoFragment newInstance(int position, String title) {
        InfoPersoFragment fragment = new InfoPersoFragment();
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
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info_perso, container, false);
    }
}