package com.sanraphindustries.sanraph.breakfree;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private boolean apprunning;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState !=null){
            apprunning = savedInstanceState.getBoolean("apprunning");
        }
        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab =  findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, R.string.add_note, Snackbar.LENGTH_LONG)
                        .setAction("Write Note", null).show();

                //Sent intent to the AddNote activity
                Intent intent = new Intent(MainActivity.this, NotePad.class);
                startActivity(intent);
            }
        });

        DrawerLayout drawer =  findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView =  findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putBoolean("apprunning", apprunning);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer =  findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        apprunning = true;
    }

    @Override
    protected void onStop() {
        super.onStop();
        apprunning = false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
            startActivity(intent);
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_intro) {
            // Handle Intro action here
            Intent intent = new Intent(MainActivity.this, Intro.class);
            startActivity(intent);
            finish();
        } else if (id == R.id.nav_one) {
            Intent intent = new Intent(MainActivity.this, One.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_two) {
            Intent intent = new Intent(MainActivity.this, Two.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_three) {
            Intent intent = new Intent(MainActivity.this, Three.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_four) {
            Intent intent = new Intent(MainActivity.this, Four.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_five) {
            Intent intent = new Intent(MainActivity.this, Five.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_six) {
            Intent intent = new Intent(MainActivity.this, Six.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_seven) {
            Intent intent = new Intent(MainActivity.this, Seven.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_eight) {
            Intent intent = new Intent(MainActivity.this, Eight.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_nine) {
            Intent intent = new Intent(MainActivity.this, Nine.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_ten) {
            Intent intent = new Intent(MainActivity.this, Ten.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_eleven) {
            Intent intent = new Intent(MainActivity.this, Eleven.class);
            startActivity(intent);
            finish();


        } else if (id == R.id.nav_twelve) {
            Intent intent = new Intent(MainActivity.this, Twelve.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_thirteen) {
            Intent intent = new Intent(MainActivity.this, Thirteen.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_fourteen) {
            Intent intent = new Intent(MainActivity.this, Fourteen.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_fifteen) {
            Intent intent = new Intent(MainActivity.this, Fifteen.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_sixteen) {
            Intent intent = new Intent(MainActivity.this, Sixteen.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_seventeen) {
            Intent intent = new Intent(MainActivity.this, Seventeen.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_eighteen) {
            Intent intent = new Intent(MainActivity.this, Eighteen.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_nineteen) {
            Intent intent = new Intent(MainActivity.this, Nineteen.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_twenty) {
            Intent intent = new Intent(MainActivity.this, Twenty.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_twenty_one) {
            Intent intent = new Intent(MainActivity.this, TwentyOne.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_share) {

            Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            String shareBody = "It is NOT the power of the curse, it is the power you give the curse, read to be free!";
            sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Breaking Free From Curses by Raji Kemi Rich");
            sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
            startActivity(Intent.createChooser(sharingIntent, "Share with"));

        }




        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
