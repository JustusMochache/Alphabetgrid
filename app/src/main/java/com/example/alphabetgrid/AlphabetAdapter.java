package com.example.alphabetgrid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class AlphabetAdapter extends BaseAdapter {
    private Context mContext;
    private String[] mLetters;

    public AlphabetAdapter(Context mContext, String[] mLetters) {
        this.mContext = mContext;
        this.mLetters = mLetters;
    }

    @Override
    public int getCount() {
        return mLetters.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View gridView;
        if(convertView==null){

            // get layout from xml file
            gridView = inflater.inflate(R.layout.alphabet_grid_item,null);

            //pull views
            TextView letterview = (TextView) gridView.findViewById(R.id.grid_item_letter);

            // set values into views
            letterview.setText("A"); //USING DUMMY DATA FOR NOW
        } else{
            gridView = (View) convertView;
        }
        return gridView;
    }
}
