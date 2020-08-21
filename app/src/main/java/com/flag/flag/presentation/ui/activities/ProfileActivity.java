package com.flag.flag.presentation.ui.activities;
import android.os.Bundle;
import com.flag.flag.presentation.ui.adapters.ViewPagerFragmentAdapter;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.flag.flag.R;

public class ProfileActivity extends AppCompatActivity
{
    ViewPager2 myViewPager2;
    ViewPagerFragmentAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        myViewPager2=findViewById(R.id.pager);
        myAdapter = new ViewPagerFragmentAdapter(getSupportFragmentManager(), getLifecycle());
        myViewPager2.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
        myViewPager2.setAdapter(myAdapter);
    }
    }

