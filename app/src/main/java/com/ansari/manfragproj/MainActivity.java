package com.ansari.manfragproj;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button frag1Button, frag2Button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frag1Button = findViewById(R.id.buttonFrag1);
        frag2Button = findViewById(R.id.buttonFrag2);

        frag1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment_One fragment_one = new Fragment_One();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentStatic,fragment_one);
                fragmentTransaction.commit();

            }
        });

        frag2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getFragmentManager().beginTransaction().replace(R.id.fragmentStatic,new Fragment_Two()).commit();

            }
        });
    }
}
