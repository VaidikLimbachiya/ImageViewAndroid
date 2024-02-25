package com.example.practicle_4;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class list extends AppCompatActivity {
    String[] car = {"RolceRoyce","Lamborghini","GTR","GT3RS",
            "BMWM5","RangeRover","ShelbyCobra"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.activity_list, car);

        ListView listView = (ListView) findViewById(R.id.lst);
        listView.setAdapter(adapter);
    }
}