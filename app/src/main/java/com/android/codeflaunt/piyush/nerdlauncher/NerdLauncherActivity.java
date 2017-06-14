package com.android.codeflaunt.piyush.nerdlauncher;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NerdLauncherActivity extends SingleFragmentActivity {

    public static Intent newInstance(Context packageContext){
        return new Intent(packageContext, NerdLauncherActivity.class);
    }


    @Override
    protected Fragment createFragment() {
        return NerdLauncherFragment.newInstance();
    }
}
