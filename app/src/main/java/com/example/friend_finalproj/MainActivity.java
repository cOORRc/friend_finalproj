package com.example.friend_finalproj;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private ImageView img_logo,img_saan,img_find;
    private Button butt_scan,butt_find,butt_staff;
    private Toolbar imformation;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// for toolbar
        imformation = (Toolbar)findViewById(R.id.toolbar);

// for imageView
        img_logo = (ImageView)findViewById(R.id.imglogoit);
        img_saan = (ImageView)findViewById(R.id.imgscan);
        img_find = (ImageView)findViewById(R.id.buttcan);

// for buttom
        butt_scan = (Button)findViewById(R.id.buttscan);
        butt_scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoscan = new Intent(MainActivity.this,TeaschScanActivity.class);
                startActivity(gotoscan);

            }
        });

        butt_find = (Button)findViewById(R.id.buttcan);
        butt_find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotologin = new Intent(MainActivity.this,SearchActivity.class);
                startActivity(gotologin);
            }
        });

        butt_staff = (Button) findViewById(R.id.buttstaff);
        butt_staff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotologin = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(gotologin);

            }
        });
    }
}
