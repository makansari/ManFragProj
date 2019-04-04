package com.ansari.manfragproj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PassingDataStaticFrag extends AppCompatActivity implements MyInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_data_static_frag);
    }

    @Override
    public void myMethod(String data) {

        Fragment_Two fragment_two = (Fragment_Two) getFragmentManager().findFragmentById(R.id.fragmentTwo);
        fragment_two.gettingMyData(data);
    }
}
