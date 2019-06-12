package com.example.ereport;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class fragment_second extends Fragment {
	public static EditText withD,evalu,refunds,expense,remain,jour,posreg,bon,transp,deb;
	View rootView;
	public static int s1=0,s2=0,s3=0,s4=0,s5=0,s6=0,s7=0,s8=0,s9=0,s10=0;
	public static int total = 0;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		rootView = inflater.inflate(R.layout.fragment_second, container, false);
		return rootView;
	}
	
	protected void init(){
	    withD = (EditText)rootView .findViewById(R.id.wdraw);
	    evalu = (EditText)rootView .findViewById(R.id.eval);
	    refunds = (EditText)rootView .findViewById(R.id.refun);
	    expense = (EditText)rootView .findViewById(R.id.exps);
	    remain = (EditText)rootView .findViewById(R.id.editText5);
	    jour = (EditText)rootView .findViewById(R.id.editText6);
	    posreg = (EditText)rootView .findViewById(R.id.editText7);
	    bon = (EditText)rootView .findViewById(R.id.editText8);
	    transp = (EditText)rootView .findViewById(R.id.editText9);
	    deb = (EditText)rootView .findViewById(R.id.editText10);
	    
	    
	    }
	
	protected static void calculate() {
		long sum = 0;
		s1 = Integer.parseInt(withD.getText().toString());
		s2= Integer.parseInt(evalu.getText().toString());
		s3 = Integer.parseInt(refunds.getText().toString());
		s4 = Integer.parseInt(expense.getText().toString());
		s5 = Integer.parseInt(remain.getText().toString());
		s5 = Integer.parseInt(jour.getText().toString());
		s5 = Integer.parseInt(posreg.getText().toString());
		s5 = Integer.parseInt(bon.getText().toString());
		s5 = Integer.parseInt(transp.getText().toString());
		s5 = Integer.parseInt(deb.getText().toString());
		total =  s1+s2+s3+s4+s5+s6+s7+s8+s9+s10;
		
	}
	
	
	
}
