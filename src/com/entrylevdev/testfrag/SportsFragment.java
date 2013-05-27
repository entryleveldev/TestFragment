package com.entrylevdev.testfrag;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class SportsFragment extends Fragment {

	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_sport, container, false);
		Button btn = (Button)v.findViewById(R.id.button1);
		btn.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
//				Log.v("TEST", "Test");
//				getChildFragmentManager()
//                .beginTransaction()
//                .addToBackStack(null)
//                .replace(R.id.tab_container, new EntertainmentFragment())
//                .commit();
				MainActivity mainAct = (MainActivity)getActivity();
				mainAct.changeFragment();
//				FragmentTransaction ft = getFragmentManager().beginTransaction();
//		        EntertainmentFragment enFragment = new EntertainmentFragment();
//		        ft.replace(android.R.id.tabcontent, enFragment);
//		        ft.commit();
			}
			
		});
        return v;
    }


	
}
