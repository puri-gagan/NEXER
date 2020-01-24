package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.bottom_navigationmain);
        navigation.setOnNavigationItemSelectedListener(navlistner);
        loadFragment( new FragmentSlider());

    }
    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navlistner =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment fragment= null;
                    switch (item.getItemId()) {
                        case R.id.na_home:
                          fragment = new FragmentSlider();

                            break;
                        case R.id.na_feadback:
                       //     fragment=new FeedbackFragment();
                            // Intent intent = new Intent(MainActivity.this,WalkActivity.class);
                            // startActivity(intent);
                            break;
                        case R.id.na_complaint:
                          //  fragment= new ComplaintFragment();
                            break;
                        case R.id.na_profile:
                              fragment= new FragmentProfile();
                            break;



                    }
                    return loadFragment(fragment);


                }
            };
}
