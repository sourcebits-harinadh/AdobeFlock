package com.sourcebits.adobeflock.cvtivities;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ClusterMainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cluster_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_cluster_main, menu);
        return true;
    }
}
