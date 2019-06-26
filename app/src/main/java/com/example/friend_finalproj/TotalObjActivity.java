package com.example.friend_finalproj;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

public class TotalObjActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private CardView card1,card2,card3,card4,card5,card6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.total_obj);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        card1 = (CardView) findViewById(R.id.card_view1); // creating a CardView and assigning a value.
        card2 = (CardView) findViewById(R.id.card_view2); // creating a CardView and assigning a value.
        card3 = (CardView) findViewById(R.id.card_view3); // creating a CardView and assigning a value.
        card4 = (CardView) findViewById(R.id.card_view4); // creating a CardView and assigning a value.
        card5 = (CardView) findViewById(R.id.card_view5); // creating a CardView and assigning a value.
        card6 = (CardView) findViewById(R.id.card_view6); // creating a CardView and assigning a value.

    }




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
            Intent gotohome = new Intent(TotalObjActivity.this,TeachActivity.class);
            startActivity(gotohome);
        } else if (id == R.id.nav_obj) {
            Intent gotoowner = new Intent(TotalObjActivity.this,TotalObjActivity.class);
            startActivity(gotoowner);
        } else if (id == R.id.nav_exit) {
            Intent gotoexit = new Intent(TotalObjActivity.this,MainActivity.class);
            startActivity(gotoexit);
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
