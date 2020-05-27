package com.example.androidfeatures2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewImage extends AppCompatActivity {

    ListView lv;
    Context context;
    ArrayList al;
    public static int[] proimages={R.drawable.ic_launcher_background,R.drawable.ic_launcher_background};
    public  static String[] prognames={"object","interface","abstract","inheritance"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_image);
        MyListAdapater mla=new MyListAdapater(this,prognames,proimages);
        lv=(ListView)findViewById(R.id.lv);
        lv.setAdapter(mla);
    }
}
