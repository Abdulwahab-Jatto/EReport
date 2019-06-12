package com.example.ereport;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


public class fragment_first extends Fragment {
	public static EditText receive,transfer,transac,wcc,ec,wc,wcp,tcp;
	static int rec = 0;
	static int tra = 0;
	static int tc = 0;
	static int wci = 0;
	static int eci = 0;
	public static int total = 0;
	View rootView;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		rootView = inflater.inflate(R.layout.fragment_first, container, false);
		init();
		//calculate();
		return rootView;
	}
	protected void init(){
	 /*   receive = (EditText)rootView .findViewById(R.id.rece);
	    transfer = (EditText)rootView .findViewById(R.id.traTxt);
	    transac = (EditText)rootView .findViewById(R.id.tcTxt);
	    wcc = (EditText)rootView .findViewById(R.id.wcCTxt);
	    ec = (EditText)rootView .findViewById(R.id.ecTxt);
	    wc = (EditText)rootView .findViewById(R.id.wcouttxt);
	    wcp = (EditText)rootView .findViewById(R.id.wcPOS);
	 */   //tcp = (EditText)rootView .findViewById(R.id.TCPOS);
	    }
	protected static void calculate() {
		long sum = 0;
		rec = Integer.parseInt(receive.getText().toString());
		tra = Integer.parseInt(transfer.getText().toString());
		tc = Integer.parseInt(transac.getText().toString());
		wci = Integer.parseInt(wcc.getText().toString());
		eci = Integer.parseInt(ec.getText().toString());
		
		total = rec + tra + tc + wci + eci;
		
	}

}
