package com.ansari.manfragproj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PassingDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_data);

        getFragmentManager().beginTransaction().add(R.id.myLayut,new Fragment_One()).commit();
    }
}
