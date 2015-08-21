package com.bis.criminalintent;

/**
 * Created by Bishal on 8/19/2015.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected CrimeListFragment createFragment() {
        return new CrimeListFragment();
    }
}
