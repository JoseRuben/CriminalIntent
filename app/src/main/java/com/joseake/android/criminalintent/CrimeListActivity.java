package com.joseake.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by CASA III on 28/11/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
