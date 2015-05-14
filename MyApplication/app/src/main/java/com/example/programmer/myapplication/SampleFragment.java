package com.example.programmer.myapplication;

/**
 * Created by programmer on 22/4/15.
 */

import android.app.Fragment;
        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.TextView;
        import android.graphics.Typeface;

public class SampleFragment extends Fragment{

    public SampleFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_details4,container, false);
        return rootView;
    }


}