package com.fileformats;
import com.fileformats.compressed.*;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class Sixth_fragment extends Fragment implements OnClickListener{
	View myView;
	Fragment myFragment = null;
	FragmentManager fm;
	FragmentTransaction ft;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		myView = inflater.inflate(R.layout.compressed, container, false);
		Button c1 = (Button)myView.findViewById(R.id.c1);
		c1.setOnClickListener(this);
		Button c2 = (Button)myView.findViewById(R.id.c2);
		c2.setOnClickListener(this);
		Button c3 = (Button)myView.findViewById(R.id.c3);
		c3.setOnClickListener(this);
		Button c4 = (Button)myView.findViewById(R.id.c4);
		c4.setOnClickListener(this);
		Button c5 = (Button)myView.findViewById(R.id.c5);
		c5.setOnClickListener(this);
		Button c6 = (Button)myView.findViewById(R.id.c6);
		c6.setOnClickListener(this);
		Button c7 = (Button)myView.findViewById(R.id.c7);
		c7.setOnClickListener(this);
		Button c8 = (Button)myView.findViewById(R.id.c8);
		c8.setOnClickListener(this);
		return myView;
	}
	@Override
	public void onClick(View v) {
		switch(v.getId())
		{
		case R.id.c1:
			myFragment = new C1();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Sixth_fragment");
            ft.commit();
			break;
		case R.id.c2:
			myFragment = new C2();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Sixth_fragment");
            ft.commit();
			break;
		case R.id.c3:
			myFragment = new C3();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Sixth_fragment");
            ft.commit();
			break;
		case R.id.c4:
			myFragment = new C4();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Sixth_fragment");
            ft.commit();
			break;
		case R.id.c5:
			myFragment = new C5();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Sixth_fragment");
            ft.commit();
			break;
		case R.id.c6:
			myFragment = new C6();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Sixth_fragment");
            ft.commit();
			break;
		case R.id.c7:
			myFragment = new C7();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Sixth_fragment");
            ft.commit();
			break;
		case R.id.c8:
			myFragment = new C8();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Sixth_fragment");
            ft.commit();
			break;
		}
	}
}
