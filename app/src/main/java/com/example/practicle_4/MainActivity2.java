package com.example.practicle_4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    //    TextView t = (TextView) findViewById(R.id.textView2);
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main_activity2);
//
//
//        //TextView t = (TextView) findViewById(R.id.textView2);
//        Intent intent = getIntent();
//        String s = intent.getStringExtra("d");
//        t.setText("Hello:"+s);
//
//    }
    ListView l;
    //TextView t = (TextView) findViewById(R.id.textView4);



    String animal[]
            = { "RolceRoyce", "Lamborghini",
            "GTR", "GT3RS",
            "BMWM5", "RangeRover",
            "ShelbyCobra"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ListView sp=findViewById(R.id.lst);
        ImageView img=findViewById(R.id.imageView2);
        int i;
        String arr[]={"GTR","Lamborghini","GT3RS","RolceRoyce","ShelbyCobra","RangeRover","BMWM5"};
        ArrayList<String> animal=new ArrayList<>();
        int s2=getIntent().getExtras().getInt("value");
        for(i=0;i<=s2-1;i++)
        {
            animal.add(arr[i]);
        }
        ArrayAdapter<String> adp=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,animal);
        sp.setAdapter(adp);
        sp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                img.setVisibility(View.VISIBLE);
                switch (position)
                {
                    case 0: img.setImageResource(R.drawable.gtr);
                        break;
                    case 1:img.setImageResource(R.drawable.lambo);
                        break;
                    case 2:img.setImageResource(R.drawable.gt);
                        break;
                    case 3:img.setImageResource(R.drawable.rroyce);
                        break;
                    case 4:img.setImageResource(R.drawable.sc);
                        break;
                    case 5:img.setImageResource(R.drawable.rr);
                        break;
                    case 6:img.setImageResource(R.drawable.bmw);
                        break;

                }
            }
        });
    }
}