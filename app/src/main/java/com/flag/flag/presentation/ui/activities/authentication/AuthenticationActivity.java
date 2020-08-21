package com.flag.flag.presentation.ui.activities.authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.flag.flag.R;
import com.flag.flag.presentation.ui.fragments.authentication.LoginFragment;
import com.flag.flag.presentation.ui.fragments.authentication.SignUpDialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class AuthenticationActivity extends AppCompatActivity {
    Button LoginButton,RegisterButton;
    //LoginFragment loginLinearLayout ;
    SignUpDialogFragment signUpLinearLayout =
            SignUpDialogFragment.newInstance();

    LoginFragment loginLinearLayout =
            LoginFragment.newInstance();


    //LinearLayout loginLinearLayout = (LinearLayout) findViewById(R.id.bottom_login_form);

    //BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.from(loginLinearLayout);




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_authentication);

        LoginButton = findViewById(R.id.login);
        RegisterButton = findViewById(R.id.sign_up);

        //get the bottom sheet view
        /*
        loginLinearLayout = findViewById(R.layout.fragment_login_dialog)
        signUpLinearLayout = findViewById(R.id.bottom_sign_up_form);
         */


        //init the bottom sheet view
        //final BottomSheetDialogFragment loginBottomSheetBehavior = new BottomSheetDialogFragment();

        /*
        sheet = new BottomSheet.Builder(this, R.style.BottomSheet_Dialog)
                .title("New")
                .grid() // <-- important part
                .sheet(R.menu.menu_bottom_sheet)
                .listener(new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // TODO
                    }
                }).build();
         */
        LoginButton.setOnClickListener(view -> new LoginFragment().show(getSupportFragmentManager(),"bottom_login_form"));

        RegisterButton.setOnClickListener(view -> new SignUpDialogFragment().show(getSupportFragmentManager(),"bottom_sign_up_form"));




    }





}