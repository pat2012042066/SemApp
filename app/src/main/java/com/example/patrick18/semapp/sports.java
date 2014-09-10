package com.example.patrick18.semapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.patrick18.semapp.R;

public class sports extends ActionBarActivity {

    public void sports2(View view) {
        Intent intent = new Intent(this, sports2.class);
        startActivity(intent);
    }

    public void badminton(View view) {
        Intent intent = new Intent(this, badminton.class);
        startActivity(intent);
    }

    public void MyActivity(View view) {
        Intent intent = new Intent(this, MyActivity.class);
        startActivity(intent);
    }

    public void baseball(View view) {
        Intent intent = new Intent(this, baseball.class);
        startActivity(intent);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);
        Intent sports = getIntent();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.sports, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
