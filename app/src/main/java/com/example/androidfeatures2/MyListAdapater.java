package com.example.androidfeatures2;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyListAdapater extends ArrayAdapter {
    private final Activity context;
    private final String[] prognames;
    private final int[] proimages;

    public MyListAdapater(Activity context, String[] prognames, int[] proimages) {
        super(context,R.layout.activity_imaga_list,prognames);
        this.context = context;
        this.prognames = prognames;
        this.proimages = proimages;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowview=inflater.inflate(R.layout.activity_imaga_list,null,true);
        ImageView m=(ImageView)rowview.findViewById(R.id.imageView);
        TextView v=(TextView)rowview.findViewById(R.id.textView);
        v.setText(prognames[position]);
        m.setImageResource(proimages[position]);
        return super.getView(position, convertView, parent);
    }
}
