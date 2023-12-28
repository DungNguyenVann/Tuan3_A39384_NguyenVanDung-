package com.example.baitaptuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    t3Adapter adapter;
    ArrayList<Contact> ls = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.bai3Lv);

    ls.add(new Contact("Nguyen Van A","18",R.drawable.ic_launcher_background));
    ls.add(new Contact("Nguyen Van B","19",R.drawable.ic_launcher_background));
    ls.add(new Contact("Nguyen Van C","20",R.drawable.ic_launcher_background));
    ls.add(new Contact("Nguyen Van D","21",R.drawable.ic_launcher_background));

    adapter = new t3Adapter(ls, this);
    lv.setAdapter(adapter);
    }
}