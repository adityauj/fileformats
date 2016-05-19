package com.fileformats;
import com.fileformats.ebook.*;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class Fifth_fragment extends Fragment implements OnClickListener{
	View myView;
	Fragment myFragment = null;
	FragmentManager fm;
	FragmentTransaction ft;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		myView = inflater.inflate(R.layout.ebook, container, false);
		Button e1 = (Button)myView.findViewById(R.id.e1);
		e1.setOnClickListener(this);
		Button e2 = (Button)myView.findViewById(R.id.e2);
		e2.setOnClickListener(this);
		Button e3 = (Button)myView.findViewById(R.id.e3);
		e3.setOnClickListener(this);
		Button e4 = (Button)myView.findViewById(R.id.e4);
		e4.setOnClickListener(this);
		Button e5 = (Button)myView.findViewById(R.id.e5);
		e5.setOnClickListener(this);
		Button e6 = (Button)myView.findViewById(R.id.e6);
		e6.setOnClickListener(this);
		Button e7 = (Button)myView.findViewById(R.id.e7);
		e7.setOnClickListener(this);
		Button e8 = (Button)myView.findViewById(R.id.e8);
		e8.setOnClickListener(this);
		Button e9 = (Button)myView.findViewById(R.id.e9);
		e9.setOnClickListener(this);
		Button e10 = (Button)myView.findViewById(R.id.e10);
		e10.setOnClickListener(this);
		Button e11 = (Button)myView.findViewById(R.id.e11);
		e11.setOnClickListener(this);
		Button e12 = (Button)myView.findViewById(R.id.e12);
		e12.setOnClickListener(this);
		Button e13 = (Button)myView.findViewById(R.id.e13);
		e13.setOnClickListener(this);
		Button e14 = (Button)myView.findViewById(R.id.e14);
		e14.setOnClickListener(this);
		Button e15 = (Button)myView.findViewById(R.id.e15);
		e15.setOnClickListener(this);
		Button e16 = (Button)myView.findViewById(R.id.e16);
		e16.setOnClickListener(this);
		return myView;
	}
	@Override
	public void onClick(View v) {
		switch(v.getId())
		{
		case R.id.e1:
			myFragment = new E1();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fifth_fragment");
            ft.commit();
			break;
		case R.id.e2:
			myFragment = new E2();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fifth_fragment");
            ft.commit();
			break;
		case R.id.e3:
			myFragment = new E3();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fifth_fragment");
            ft.commit();
			break;
		case R.id.e4:
			myFragment = new E4();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fifth_fragment");
            ft.commit();
			break;
		case R.id.e5:
			myFragment = new E5();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fifth_fragment");
            ft.commit();
			break;
		case R.id.e6:
			myFragment = new E6();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fifth_fragment");
            ft.commit();
			break;
		case R.id.e7:
			myFragment = new E7();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fifth_fragment");
            ft.commit();
			break;
		case R.id.e8:
			myFragment = new E8();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fifth_fragment");
            ft.commit();
			break;
		case R.id.e9:
			myFragment = new E9();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fifth_fragment");
            ft.commit();
			break;
		case R.id.e10:
			myFragment = new E10();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fifth_fragment");
            ft.commit();
			break;
		case R.id.e11:
			myFragment = new E11();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fifth_fragment");
            ft.commit();
			break;
		case R.id.e12:
			myFragment = new E12();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fifth_fragment");
            ft.commit();
			break;
		case R.id.e13:
			myFragment = new E13();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fifth_fragment");
            ft.commit();
			break;
		case R.id.e14:
			myFragment = new E14();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fifth_fragment");
            ft.commit();
			break;
		case R.id.e15:
			myFragment = new E15();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fifth_fragment");
            ft.commit();
			break;
		case R.id.e16:
			myFragment = new E16();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fifth_fragment");
            ft.commit();
			break;
		}
	}
}
