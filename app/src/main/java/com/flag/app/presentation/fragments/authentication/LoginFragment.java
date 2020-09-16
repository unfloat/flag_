package com.flag.app.presentation.fragments.authentication;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.flag.app.MainActivity;
import com.flag.app.R;
import com.flag.app.presentation.activities.AuthenticationActivity;
import com.flag.app.ui.parametres.AboutFragment;
import com.flag.app.ui.profile.ProfileFragment;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

/**
 * <p>A fragment that shows a list of items as a modal bottom sheet.</p>
 * <p>You can show this modal bottom sheet from your activity like this:</p>
 * <pre>
 *     LoginFragment.newInstance(30).show(getSupportFragmentManager(), "dialog");
 * </pre>
 */
public class LoginFragment extends BottomSheetDialogFragment {

    Button loginBtn;
    TextView forgotPassword;
    public static LoginFragment newInstance() {

        final LoginFragment fragment = new LoginFragment();
        final Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_bottom_sheet_login, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        forgotPassword = (TextView) view.findViewById(R.id.forgot_password_text);
        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }});


        loginBtn = (Button) view.findViewById(R.id.login);
        loginBtn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent = new Intent(getActivity(), MainActivity.class);
                                            startActivity(intent);


                                        }
                                    }

        );

    }



}