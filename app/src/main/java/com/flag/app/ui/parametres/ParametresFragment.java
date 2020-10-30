package com.flag.app.ui.parametres;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.flag.app.R;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ParametresFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ParametresFragment extends Fragment {

    TextView about_text, langues_text;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ParametresFragment() {
        // Required empty public constructor
    }


    public static ParametresFragment newInstance() {
        return new ParametresFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_parametres, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        about_text = (TextView) view.findViewById(R.id.text_btn_about);
        langues_text = (TextView) view.findViewById(R.id.language);

        about_text.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {
                                                Intent intent = new Intent(getContext(), AboutActivity.class);
                                                startActivity(intent);

                                          }
                                      });


        langues_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new BottomSheetChooseLanguageFragment().show(requireActivity().getSupportFragmentManager(), "bottom_language");
            }
        });
    }

    /**
     * Change the current displayed fragment by a new one.
     * - if the fragment is in backstack, it will pop it
     * - if the fragment is already displayed (trying to change the fragment with the same), it will not do anything
     *
     * @param frag            the new fragment to display
     * @param saveInBackstack if we want the fragment to be in backstack
     * @param animate         if we want a nice animation or not
     */
    private void changeFragment(Fragment frag, boolean saveInBackstack, boolean animate) {
        String backStateName = ((Object) frag).getClass().getName();

        try {

            FragmentManager manager = getFragmentManager();
            if (manager != null) {
                boolean fragmentPopped = manager.popBackStackImmediate(backStateName, 0);

                if (!fragmentPopped && manager.findFragmentByTag(backStateName) == null) {
                    //fragment not in back stack, create it.
                    FragmentTransaction transaction = manager.beginTransaction();
                    /*
                    if (animate) {
                        //transaction.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
                    }
                     */
                    transaction.replace(R.id.container, frag, backStateName);

                    if (saveInBackstack) {
                        transaction.addToBackStack(backStateName);
                    }
                    transaction.commit();
                }
            }

        } catch (IllegalStateException exception) {
            Snackbar.make(this.getView(), "Unable to commit fragment, could be activity as been killed in smalltop. " + exception.toString(), BaseTransientBottomBar.LENGTH_LONG);
        }
    }

}