package com.example.androidfeatures2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
/** MENU
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.settings;
                Toast.makeText(this,"settings", Toast.LENGTH_SHORT).show();
            case R.id.about;
                Toast.makeText(this,"about", Toast.LENGTH_SHORT).show();
            case R.id.contact;
                Toast.makeText(this,"contact", Toast.LENGTH_SHORT).show();
        }
        return true;
    }*/
}
