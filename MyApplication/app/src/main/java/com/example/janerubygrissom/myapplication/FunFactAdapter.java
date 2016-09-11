package com.example.janerubygrissom.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by janerubygrissom on 9/9/16.
 */
public class FunFactAdapter extends BaseAdapter {
    ArrayList<FunFacts> mFactsList;
    Context mContext;

    public FunFactAdapter(Context context, ArrayList<FunFacts> factsList){
        mContext = context;
        mFactsList = factsList;


    }

    @Override
    public int getCount() {
        return mFactsList.size();
    }

    @Override
    public Object getItem(int i) {
        return mFactsList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null){
            view = LayoutInflater.from(mContext).inflate(android.R.layout.simple_list_item_2, viewGroup, false);
            TextView tv = (TextView) view.findViewById(android.R.id.text1);
            TextView tv2 = (TextView) view.findViewById(android.R.id.text2);

            tv.setTextColor(Color.WHITE);
            tv2.setTextColor(Color.WHITE);

            tv.setTypeface(null, Typeface.BOLD);
            tv2.setTypeface(null, Typeface.ITALIC);

            // String fact = FactsList.get(i).getFactTitle();


            tv.setText(mFactsList.get(i).getFactTitle());
            tv2.setText(mFactsList.get(i).getFactBody());
        }

        return view;
    }
}
