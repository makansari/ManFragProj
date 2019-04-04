package com.ansari.manfragproj;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment_One extends Fragment {

Button passDataButton;
MyInterface myInterface;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        myInterface = (MyInterface) getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {

       View view = inflater.inflate(R.layout.fragment_one,container,false);

       passDataButton = view.findViewById(R.id.buttonPassData);

       passDataButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               /*Fragment_Two fragment_two = new Fragment_Two();
               Bundle bundle = new Bundle();
               bundle.putString("key","Ansari");

               fragment_two.setArguments(bundle);

               getFragmentManager().beginTransaction().replace(R.id.myLayut,fragment_two).commit();*/

               myInterface.myMethod("Abdul");
           }
       });

        return view;
    }
}
