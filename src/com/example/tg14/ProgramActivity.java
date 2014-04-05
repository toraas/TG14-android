package com.example.tg14;

import java.io.IOException;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.text.method.ScrollingMovementMethod;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.os.Build;

public class ProgramActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//Sets a new Title on the activity
		setTitle("The Gathering 2014 - Program");
		
		//Sets which content to view
		setContentView(R.layout.activity_program);

		// Runs method "getDataFromServer"
		getDataFromServer();
		
	}

	private void getDataFromServer() {
		TextView tv = (TextView)findViewById(R.id.textView1);
		tv.setMovementMethod(new ScrollingMovementMethod());
		GetFromWeb showData = new GetFromWeb();
		showData.setInputUrl("The URL here");
		try {
			tv.setText(showData.getFromServer());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			tv.setText("No Internet Connection");
		}
	}
}
