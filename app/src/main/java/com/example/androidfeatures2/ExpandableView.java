package com.example.androidfeatures2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpandableView extends AppCompatActivity {
    ExpandableListView expandableListView;
    List<String>  lang;
    Map<String,List<String>>topics;
    ExpandableListAdapter listAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandable_view);
        expandableListView=(ExpandableListView)findViewById(R.id.epl);
        fillData();
        listAdapter=new MyExListAdapater(this,lang,topics);
        expandableListView.setAdapter(listAdapter);

    }
    public void fillData(){

        lang=new ArrayList<>();
        lang.add("java");
        lang.add("c");
        List<String> java=new ArrayList<>();
        java.add("tread");
        java.add("abstract");
        java.add("super");
        List<String> c=new ArrayList<>();
        c.add("array");
        c.add("strings");
        c.add("methods");
        topics=new HashMap<>();
        topics.put(lang.get(0),java);
        topics.put(lang.get(1),c);
    }
}
