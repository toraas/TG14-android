package com.example.tg14;

import java.io.IOException;

import com.toraas.tg14.R;

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

public class CreativeActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//Sets which content to view
		setContentView(R.layout.activity_creative);

		// Runs method "getDataFromServer"
		getDataFromServer();
	}

	private void getDataFromServer() {
		TextView tv = (TextView)findViewById(R.id.textView1);
		tv.setMovementMethod(new ScrollingMovementMethod());
		GetFromWeb showData = new GetFromWeb();
		showData.setInputUrl("http://toraas.com/TG14-app/app-creative.txt");
		try {
			tv.setText(showData.getFromServer());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			tv.setText("No Internet Connection");
		}
	}
}
