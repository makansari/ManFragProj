package com.ansari.manfragproj;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment_Two extends Fragment {


    TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_two,container,false);
        textView = v.findViewById(R.id.textViewResult);

    /*    Bundle bundle = getArguments();
        String result =  bundle.getString("key");
        textView.setText(result);*/
        return v;
    }

    public void gettingMyData(String msg){
        textView.setText(msg);
    }
}
