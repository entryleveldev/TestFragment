package com.entrylevdev.testfrag;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends FragmentActivity {
		
	private FragmentTabHost mHost;
	
	public void changeFragment() {
		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        EntertainmentFragment enFragment = new EntertainmentFragment();
        ft.replace(R.id.tabcontent, enFragment);
        ft.commit();
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
	    mHost.setup(this, getSupportFragmentManager(), R.id.tabcontent);
        mHost.addTab(mHost.newTabSpec("School")
                .setIndicator("School"), SchoolFragment.class, null);
        mHost.addTab(mHost.newTabSpec("Sport")
                .setIndicator("Sport"), SportsFragment.class, null);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
