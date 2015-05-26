package com.example.programmer.myapplication;

/**
 * Created by programmer on 13/5/15.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by programmer on 22/4/15.
 */


public class DetailHome extends Fragment {

    public DetailHome(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.fragment_detail_home,container, false);


        Button imgmap=(Button) rootView.findViewById(R.id.map);
        Button imgvideo=(Button) rootView.findViewById(R.id.star);
        Button imghome=(Button) rootView.findViewById(R.id.info);

        imgmap.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                getActivity().getFragmentManager().beginTransaction()
                        .replace(R.id.container, new DetailMap())
                        .commit();

            }
        });


        imgvideo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                getActivity().getFragmentManager().beginTransaction()
                        .replace(R.id.container, new DetailVideo())
                        .commit();

            }
        });

        imghome.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                getActivity().getFragmentManager().beginTransaction()
                        .replace(R.id.container, new DetailHome())
                        .commit();

            }
        });


        return rootView;

    }


}