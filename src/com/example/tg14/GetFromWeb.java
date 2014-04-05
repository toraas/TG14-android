package com.example.tg14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class GetFromWeb {
	
	private String inputUrl;


	public String getFromServer() throws IOException{
		
		URL Url = new URL(inputUrl);
		String returnString = "";
		String[] returnThisArray = new String[100];
	
		// Read all the text returned by the server
		BufferedReader urlReader = new BufferedReader(new InputStreamReader(Url.openStream()));
		
		for(int i = 0 ; i < 99 ; i++) {
			returnThisArray[i] = urlReader.readLine();
			if(returnThisArray[i] != null) returnString += returnThisArray[i] + "\n";
		}
		
		urlReader.close();
		
		return returnString;
	}
	
	/**
	 * Sets the URL for the site you want to read from.
	 * @param inputUrl
	 */
	public void setInputUrl(String inputUrl) {
		this.inputUrl = inputUrl;
	}
	
}
