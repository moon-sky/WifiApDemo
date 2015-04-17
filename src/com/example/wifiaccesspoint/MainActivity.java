package com.example.wifiaccesspoint;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	WifiApAdmin admin;
	static final String SSID="MOON-TEST";
	static final String pwd="0123456789";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		admin=new WifiApAdmin(this);
		
		findViewById(R.id.btn_start).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				admin.startWifiAp(SSID, pwd);
			}
		});
		findViewById(R.id.btn_stop).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				WifiApAdmin.closeWifiAp(MainActivity.this);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
