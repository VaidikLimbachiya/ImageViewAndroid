package com.example.practicle_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText t1=findViewById(R.id.editTextNumber);
        Button b1=findViewById(R.id.buttonNext);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int s1=Integer.parseInt(t1.getText().toString());
                if(s1<=7 && s1>=1) {
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("value",s1);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "enter only integer value between 1 to 7", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}