package com.example.programmer.myapplication;

/**
 * Created by BinaryArrows on 4/27/2015.
 */

import android.app.Fragment;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Gallery;

import java.util.ArrayList;
import java.util.List;

public class ExploreFragment extends Fragment {

    String[] menuTitles;
    String[] menuOffers;
    String[] menuLikes;
    String[] menuRedeem;
    TypedArray menuMain;
    TypedArray menuIcons;

    Gallery myHorizontalListView;
    ExploreCustomAdapter adapter;
    private List<ExploreRowItem> rowItems;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.explore_fragment, null, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);

        menuTitles = getResources().getStringArray(R.array.titles);
        menuOffers = getResources().getStringArray(R.array.offers);
        menuLikes = getResources().getStringArray(R.array.like);
        menuRedeem = getResources().getStringArray(R.array.redeemed);
        menuMain = getResources().obtainTypedArray(R.array.icons);
        menuIcons = getResources().obtainTypedArray(R.array.icon);

        rowItems = null;
        rowItems = new ArrayList<ExploreRowItem>();

        int leng = menuTitles.length;


       for (int i = 0; i < menuTitles.length; i++) {
            ExploreRowItem items = new ExploreRowItem(menuTitles[i], menuOffers[i], menuMain.getResourceId(i, -1), menuIcons.getResourceId(0, -1), menuIcons.getResourceId(1, -1), menuLikes[i], menuRedeem[i], "redeemed");

            rowItems.add(items);
       }

        myHorizontalListView = (Gallery) getView().findViewById(R.id.horizontallistview);

        adapter = new ExploreCustomAdapter(getActivity(), rowItems);
        myHorizontalListView.setAdapter(adapter);
        //getListView().setOnItemClickListener(this);
        //setListAdapter(adapter);
        //getListView().setOnItemClickListener(this);

    }

   /* @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
                            long id) {

        Toast.makeText(getActivity(), menuTitles[position], Toast.LENGTH_SHORT)
                .show();

    }*/

}