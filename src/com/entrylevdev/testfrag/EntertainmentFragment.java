package com.entrylevdev.testfrag;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class EntertainmentFragment extends Fragment {

	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
		if (container == null) {
            return null;
        }
		Log.v("onCreateView","onCreateView");
		
		View v = inflater.inflate(R.layout.entertainment, container, false);
		
        // Inflate the layout for this fragment
        return v;
    }
}
