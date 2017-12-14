package com.example.asmaa.retrocategory;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private ListView names;
    private SimpleAdapter adapter;
    private ArrayList<HashMap<String, String>> arraylist;
    private HashMap<String, String> hashMap;
    String[] arr = {"sport", "music", "health-and-medical","technology","general","gaming","politics","science_and_nature","business","business_entertainment"};
    String []aaa = {"name"};
    int []bbb = {R.id.txt1};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arraylist = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            hashMap = new HashMap<>();
            hashMap.put("name", arr[i]);
            arraylist.add(hashMap);
        }
        names = (ListView) findViewById(R.id.list_1);
        adapter = new SimpleAdapter(this, arraylist, R.layout.list1, aaa, bbb);
        names.setAdapter(adapter);

        names.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("position", position);
                    startActivity(intent);
                }





        });

    }
    }

