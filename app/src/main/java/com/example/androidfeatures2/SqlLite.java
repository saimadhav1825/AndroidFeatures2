package com.example.androidfeatures2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class SqlLite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_sql_lite);
         MySqLiteHelper sl=new MySqLiteHelper(this);
         /** to store data into database
         *SQLiteDatabase sb=sl.getWritableDatabase();
        ContentValues c=new ContentValues();
        c.put("sid",1);
        c.put("sname","siva");
        c.put("smarks","100");
            Long row=sb.insert("student",null,c);
           System.out.print("row valuses is"+row);*/

           SQLiteDatabase sb=sl.getReadableDatabase();
           String projection[]={"sid","sname","smarks"};
        Cursor c=sb.query("student",projection,null,null,null,null,null);
        c.moveToFirst();
        System.out.print("name is"+c.getString(1));


    }
}
