package com.example.friend_finalproj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.ImageView;

public class TeachActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private ImageView img_scan,img_find;
    private Button butt_scan_teach,butt_find_teach;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teach);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        img_scan = (ImageView)findViewById(R.id.imgscan);
        img_find = (ImageView)findViewById(R.id.imgfind);

/*buttom for Scan*/
        butt_scan_teach = (Button)findViewById(R.id.buttscan);
        butt_scan_teach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoscan = new Intent(TeachActivity.this,TeaschScanActivity.class);
                startActivity(gotoscan);
            }
        });
/**********************************************************/

/*buttom for Find*/
        butt_find_teach = (Button)findViewById(R.id.buttcan);
        butt_find_teach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotosearch = new Intent(TeachActivity.this,SearchActivity.class);
                startActivity(gotosearch);
            }
        });
    }
    /**********************************************************/
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
            Intent gotohome = new Intent(TeachActivity.this,TeachActivity.class);
            startActivity(gotohome);
        } else if (id == R.id.nav_obj) {
            Intent gotoowner = new Intent(TeachActivity.this,TotalObjActivity.class);
            startActivity(gotoowner);
        } else if (id == R.id.nav_exit) {
            Intent gotoexit = new Intent(TeachActivity.this,MainActivity.class);
            startActivity(gotoexit);
        }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
