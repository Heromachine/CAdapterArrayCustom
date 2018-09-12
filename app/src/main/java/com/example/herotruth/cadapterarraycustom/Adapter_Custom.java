package com.example.herotruth.cadapterarraycustom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class Adapter_Custom extends BaseAdapter {

    int myImages[];
    String myCountries[];
    Context ctx;

    LayoutInflater layoutInflater;

    public Adapter_Custom(int[] myImages, String[] myCountries, Context context)
    {
        this.myImages = myImages;
        this.myCountries = myCountries;
        this.ctx = context;

        layoutInflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return myCountries.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = layoutInflater.inflate()

    }
}
