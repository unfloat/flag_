package com.flag.flag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.flag.flag.presentation.ui.activities.authentication.AuthenticationActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void test(View view)
    {
        Intent myIntent = new Intent(MainActivity.this, AuthenticationActivity.class);
        System.out.println(myIntent);
        MainActivity.this.startActivity(myIntent);
    }


}