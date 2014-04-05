package com.example.tg14;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        //Sets a new Title on the activity
        setTitle("The Gathering 2014");
        
        //Sets which content to view
        setContentView(R.layout.activity_main);
    }

  //The method called when button "Program" is clicked
    public void toTheProgram(View view) {
    	Intent intent = new Intent(this, ProgramActivity.class);        
        startActivity(intent);
    }
    
  //The method called when button "Kart" is clicked
    public void toTheMap(View view) {
    	Intent intent = new Intent(this, MapActivity.class);        
        startActivity(intent);
    }
    
    //The method called when button "Finaler" is clicked
    public void toTheFinals(View view) {
    	Intent intent = new Intent(this, ProgramMatchActivity.class);        
        startActivity(intent);
    }
}
