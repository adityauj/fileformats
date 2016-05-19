package com.fileformats;

import com.fileformats.cad.*;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class Seventh_fragment extends Fragment implements OnClickListener{
	View myView;
	Fragment myFragment = null;
	FragmentManager fm;
	FragmentTransaction ft;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		myView = inflater.inflate(R.layout.cad, container, false);
		Button c1 = (Button)myView.findViewById(R.id.cc1);
		c1.setOnClickListener(this);
		Button c2 = (Button)myView.findViewById(R.id.cc2);
		c2.setOnClickListener(this);
		return myView;
	}
	@Override
	public void onClick(View v) {
		switch(v.getId())
		{
		case R.id.cc1:
			myFragment = new C1();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Seventh_fragment");
            ft.commit();
			break;
		case R.id.cc2:
			myFragment = new C2();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Seventh_fragment");
            ft.commit();
			break;
		}
	}
}
