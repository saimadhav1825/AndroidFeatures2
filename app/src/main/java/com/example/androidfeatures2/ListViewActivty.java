package com.example.androidfeatures2;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;

public class ListViewActivty extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_activty);
        lv=(ListView)findViewById(R.id.proglist);
        final String values[]={"c","c++","java","python","scala","c#"};
        //Adpater ->Array adapters,simpleCursorAdapters
        //to conver array into listview
        ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_list_item_1, Arrays.asList(values));
        lv.setAdapter(aa);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivty.this,"u clicked"+ values[position],Toast.LENGTH_SHORT).show();
            }
        });
    }
}
