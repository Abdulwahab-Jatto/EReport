package com.example.ereport;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class fragment_third extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_third, container, false);
		
		final FragmentActivity fragmentBelongActivity = getActivity();
		
		 if(rootView!=null) {
			 Button sendButton = (Button)rootView.findViewById(R.id.send);
			 sendButton.setOnClickListener(new View.OnClickListener() {
	                @Override
	                public void onClick(View view) {
	                	fragment_second.calculate();
	                	String s = String.valueOf(fragment_second.total);//edt.getText().toString();
	                	Toast.makeText(fragmentBelongActivity, s, Toast.LENGTH_SHORT).show();
	                }
	            });
		 }
		return rootView;
	}}
