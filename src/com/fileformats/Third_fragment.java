package com.fileformats;
import com.fileformats.music.*;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class Third_fragment extends Fragment implements OnClickListener{
	View myView;
	Fragment myFragment = null;
	FragmentManager fm;
	FragmentTransaction ft;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		myView = inflater.inflate(R.layout.music, container, false);
		Button m1 = (Button)myView.findViewById(R.id.m1);
		m1.setOnClickListener(this);
		Button m2 = (Button)myView.findViewById(R.id.m2);
		m2.setOnClickListener(this);
		Button m3 = (Button)myView.findViewById(R.id.m3);
		m3.setOnClickListener(this);
		Button m4 = (Button)myView.findViewById(R.id.m4);
		m4.setOnClickListener(this);
		Button m5 = (Button)myView.findViewById(R.id.m5);
		m5.setOnClickListener(this);
		Button m6 = (Button)myView.findViewById(R.id.m6);
		m6.setOnClickListener(this);
		Button m7 = (Button)myView.findViewById(R.id.m7);
		m7.setOnClickListener(this);
		Button m8 = (Button)myView.findViewById(R.id.m8);
		m8.setOnClickListener(this);
		Button m9 = (Button)myView.findViewById(R.id.m9);
		m9.setOnClickListener(this);
		Button m10 = (Button)myView.findViewById(R.id.m10);
		m10.setOnClickListener(this);
		Button m11 = (Button)myView.findViewById(R.id.m11);
		m11.setOnClickListener(this);
		Button m12 = (Button)myView.findViewById(R.id.m12);
		m12.setOnClickListener(this);
		Button m13 = (Button)myView.findViewById(R.id.m13);
		m13.setOnClickListener(this);
		Button m14 = (Button)myView.findViewById(R.id.m14);
		m14.setOnClickListener(this);
		Button m15 = (Button)myView.findViewById(R.id.m15);
		m15.setOnClickListener(this);
		Button m16 = (Button)myView.findViewById(R.id.m16);
		m16.setOnClickListener(this);
		return myView;
	}
	@Override
	public void onClick(View v) {
		switch(v.getId())
		{
		case R.id.m1:
			myFragment = new M1();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Third_fragment");
            ft.commit();
			break;
		case R.id.m2:
			myFragment = new M2();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Third_fragment");
            ft.commit();
			break;
		case R.id.m3:
			myFragment = new M3();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Third_fragment");
            ft.commit();
			break;
		case R.id.m4:
			myFragment = new M4();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Third_fragment");
            ft.commit();
			break;
		case R.id.m5:
			myFragment = new M5();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Third_fragment");
            ft.commit();
			break;
		case R.id.m6:
			myFragment = new M6();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Third_fragment");
            ft.commit();
			break;
		case R.id.m7:
			myFragment = new M7();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Third_fragment");
            ft.commit();
			break;
		case R.id.m8:
			myFragment = new M8();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Third_fragment");
            ft.commit();
			break;
		case R.id.m9:
			myFragment = new M9();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Third_fragment");
            ft.commit();
			break;
		case R.id.m10:
			myFragment = new M10();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Third_fragment");
            ft.commit();
			break;
		case R.id.m11:
			myFragment = new M11();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Third_fragment");
            ft.commit();
			break;
		case R.id.m12:
			myFragment = new M12();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Third_fragment");
            ft.commit();
			break;
		case R.id.m13:
			myFragment = new M13();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Third_fragment");
            ft.commit();
			break;
		case R.id.m14:
			myFragment = new M14();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Third_fragment");
            ft.commit();
			break;
		case R.id.m15:
			myFragment = new M15();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Third_fragment");
            ft.commit();
			break;
		case R.id.m16:
			myFragment = new M16();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Third_fragment");
            ft.commit();
			break;
		}
	}
}
