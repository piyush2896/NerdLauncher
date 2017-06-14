package com.android.codeflaunt.piyush.nerdlauncher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.app_drawer_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(NerdLauncherActivity.newInstance(MainActivity.this));
            }
        });
    }

    @Override
    public void onBackPressed() {

    }
}
