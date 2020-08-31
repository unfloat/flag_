package com.flag.app.presentation.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.flag.app.R;
import com.flag.app.presentation.fragments.authentication.LoginFragment;
import com.flag.app.presentation.fragments.authentication.SignUpDialogFragment;

public class AuthenticationActivity extends AppCompatActivity {
    Button LoginButton,RegisterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);
        LoginButton = findViewById(R.id.login_btn);
        RegisterButton = findViewById(R.id.sign_up_btn);

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new LoginFragment().show(AuthenticationActivity.this.getSupportFragmentManager(), "bottom_login_form");
            }
        });
        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new SignUpDialogFragment().show(AuthenticationActivity.this.getSupportFragmentManager(), "bottom_sign_up_form");
            }
        });
    }
}