package com.entrylevdev.testfrag;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.Menu;
import android.widget.TabHost;

public class MainActivity extends FragmentActivity {

	private FragmentTabHost mHost;
	private String TAG = "MainActivity";
	private EntertainmentFragment enFrag;
	private SchoolFragment schoolFrag;
	private SportsFragment sportFrag;

	public void changeFragment() {
		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		enFrag = new EntertainmentFragment();
		ft.replace(R.id.tabcontent, enFrag);
		// ft.addToBackStack(null);
		ft.commit();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
		mHost.setup(this, getSupportFragmentManager(), R.id.tabcontent);
		mHost.addTab(mHost.newTabSpec("School").setIndicator("School"),
				SchoolFragment.class, null);
		mHost.addTab(mHost.newTabSpec("Sport").setIndicator("Sport"),
				SportsFragment.class, null);
		mHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {

			@Override
			public void onTabChanged(String tabId) {
				// TODO Auto-generated method stub
				if (tabId.equalsIgnoreCase("School")) {
					Log.v(TAG, "school");
					FragmentTransaction ft = getSupportFragmentManager()
							.beginTransaction();
					schoolFrag = new SchoolFragment();
					ft.replace(R.id.tabcontent, schoolFrag);
					ft.commit();
				}
				if (tabId.equalsIgnoreCase("Sport")) {
					Log.v(TAG, "Sport");
					FragmentTransaction ft = getSupportFragmentManager()
							.beginTransaction();
					SportsFragment sportFrag = new SportsFragment();
					ft.replace(R.id.tabcontent, sportFrag);
					ft.commit();
				}
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
