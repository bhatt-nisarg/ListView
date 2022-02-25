package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
public class MainActivity extends AppCompatActivity {
    ListView listView;
    MyListAdapter adapter;

    String[] listitem = {"1","2","3","4","5","6","7","8","9","10","Android","IPhone","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X","11","12","13","14","15","16","17","18","19","20"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter = new MyListAdapter(this,listitem);
        listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);
    }
}