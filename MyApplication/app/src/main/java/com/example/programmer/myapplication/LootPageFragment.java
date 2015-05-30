package com.example.programmer.myapplication;

/**
 * Created by BinaryArrows on 4/27/2015.
 */
import java.util.ArrayList;
import java.util.List;

import android.app.ListFragment;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class LootPageFragment extends ListFragment implements OnItemClickListener {

    String[] menutitles;
    String[] menuoffers;
    String[] menuredeems;
    String[] menuexpires;
    TypedArray menuIcons;

    LootPageCustomAdapter adapter;
    private List<LootPageRowItem> rowItems;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


         //View xx=inflater.inflate(R.layout.lootpage_fragment, null, false);

        //ImageView x= (ImageView) xx.findViewById(R.id.ok);

       // x.setOnClickListener(new View.OnClickListener() {
           // public void onClick(View v) {
               // Toast.makeText(this, "Android Simple Toast", Toast.LENGTH_LONG).show();
           // }
       // });




        return inflater.inflate(R.layout.lootpage_fragment, null, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);

        menutitles = getResources().getStringArray(R.array.titles);
        menuoffers = getResources().getStringArray(R.array.offers);
        menuredeems = getResources().getStringArray(R.array.redeems);
        menuexpires = getResources().getStringArray(R.array.expires);
        menuIcons = getResources().obtainTypedArray(R.array.icons);

        rowItems = new ArrayList<LootPageRowItem>();

        for (int i = 0; i < menutitles.length; i++) {
            LootPageRowItem items = new LootPageRowItem(menutitles[i], menuIcons.getResourceId(
                    i, -1), menuoffers[i], menuredeems[i], menuexpires[i]);

            rowItems.add(items);
        }

        adapter = new LootPageCustomAdapter(getActivity(), rowItems);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
                            long id) {

        // Toast.makeText(getActivity(), menutitles[position], Toast.LENGTH_SHORT)
        //        .show();

        btntoast(view);

    }





    // My custom toast
    public void btntoast(View view) {
        Context context=getActivity().getApplicationContext();
        LayoutInflater inflater=getActivity().getLayoutInflater();

        View customToastroot =inflater.inflate(R.layout.loot_toast, null);

        Toast customtoast=new Toast(context);

        customtoast.setView(customToastroot);
        customtoast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL,0, 0);
        customtoast.setDuration(Toast.LENGTH_LONG);
        customtoast.show();
    }

}