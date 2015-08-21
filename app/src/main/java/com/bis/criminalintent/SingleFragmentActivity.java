package com.bis.criminalintent;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Bishal on 8/19/2015.
 */
public abstract class SingleFragmentActivity extends AppCompatActivity {
    protected abstract CrimeListFragment createFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        android.support.v4.app.Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);

        if(fragment == null){
            fragment = createFragment();
            fm.beginTransaction()
                    .add(R.id.fragmentContainer, fragment)
                    .commit();
        }
    }
}
