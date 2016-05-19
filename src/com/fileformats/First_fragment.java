package com.fileformats;

import com.fileformats.documents.*;
import com.fileformats.R;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.view.View.OnClickListener;

public class First_fragment extends Fragment implements OnClickListener{
	Fragment myFragment = null;
	FragmentManager fm;
	FragmentTransaction ft;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		final View myView = inflater.inflate(R.layout.documents, container, false);
		Button d1 = (Button)myView.findViewById(R.id.d1);
		d1.setOnClickListener(this);
		Button d2 = (Button)myView.findViewById(R.id.d2);
		d2.setOnClickListener(this);
		Button d3 = (Button)myView.findViewById(R.id.d3);
		d3.setOnClickListener(this);
		Button d4 = (Button)myView.findViewById(R.id.d4);
		d4.setOnClickListener(this);
		Button d5 = (Button)myView.findViewById(R.id.d5);
		d5.setOnClickListener(this);
		Button d6 = (Button)myView.findViewById(R.id.d6);
		d6.setOnClickListener(this);
		Button d7 = (Button)myView.findViewById(R.id.d7);
		d7.setOnClickListener(this);
		Button d8 = (Button)myView.findViewById(R.id.d8);
		d8.setOnClickListener(this);
		Button d9 = (Button)myView.findViewById(R.id.d9);
		d9.setOnClickListener(this);
		Button d10 = (Button)myView.findViewById(R.id.d10);
		d10.setOnClickListener(this);
		Button d11 = (Button)myView.findViewById(R.id.d11);
		d11.setOnClickListener(this);
		Button d12 = (Button)myView.findViewById(R.id.d12);
		d12.setOnClickListener(this);
		Button d13 = (Button)myView.findViewById(R.id.d13);
		d13.setOnClickListener(this);
		Button d14 = (Button)myView.findViewById(R.id.d14);
		d14.setOnClickListener(this);
		Button d15 = (Button)myView.findViewById(R.id.d15);
		d15.setOnClickListener(this);
		Button d16 = (Button)myView.findViewById(R.id.d16);
		d16.setOnClickListener(this);
		Button d17 = (Button)myView.findViewById(R.id.d17);
		d17.setOnClickListener(this);
		Button d18 = (Button)myView.findViewById(R.id.d18);
		d18.setOnClickListener(this);
		Button d19 = (Button)myView.findViewById(R.id.d19);
		d19.setOnClickListener(this);
		Button d20 = (Button)myView.findViewById(R.id.d20);
		d20.setOnClickListener(this);
		Button d21 = (Button)myView.findViewById(R.id.d21);
		d21.setOnClickListener(this);
		Button d22 = (Button)myView.findViewById(R.id.d22);
		d22.setOnClickListener(this);
		Button d23 = (Button)myView.findViewById(R.id.d23);
		d23.setOnClickListener(this);
		Button d24 = (Button)myView.findViewById(R.id.d24);
		d24.setOnClickListener(this);
		Button d25 = (Button)myView.findViewById(R.id.d25);
		d25.setOnClickListener(this);
		Button d26 = (Button)myView.findViewById(R.id.d26);
		d26.setOnClickListener(this);
		Button d27 = (Button)myView.findViewById(R.id.d27);
		d27.setOnClickListener(this);
		Button d28 = (Button)myView.findViewById(R.id.d28);
		d28.setOnClickListener(this);
		Button d29 = (Button)myView.findViewById(R.id.d29);
		d29.setOnClickListener(this);
		Button d30 = (Button)myView.findViewById(R.id.d30);
		d30.setOnClickListener(this);
		Button d31 = (Button)myView.findViewById(R.id.d31);
		d31.setOnClickListener(this);
		Button d32 = (Button)myView.findViewById(R.id.d32);
		d32.setOnClickListener(this);
		return myView;
	}
	@Override
	public void onClick(View v) {
		switch(v.getId())
		{
		case R.id.d1:
			myFragment = new D1();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("First_fragment");
            ft.commit();
			break;
		case R.id.d2:
			myFragment = new D2();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("First_fragment");
            ft.commit();
			break;
		case R.id.d3:
			myFragment = new D3();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("First_fragment");
            ft.commit();
			break;
		case R.id.d4:
			myFragment = new D4();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("First_fragment");
            ft.commit();
			break;
		case R.id.d5:
			myFragment = new D5();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("First_fragment");
            ft.commit();
			break;
		case R.id.d6:
			myFragment = new D6();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("First_fragment");
            ft.commit();
			break;
		case R.id.d7:
			myFragment = new D7();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("First_fragment");
            ft.commit();
			break;
		case R.id.d8:
			myFragment = new D8();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("First_fragment");
            ft.commit();
			break;
		case R.id.d9:
			myFragment = new D9();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("First_fragment");
            ft.commit();
			break;
		case R.id.d10:
			myFragment = new D10();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("First_fragment");
            ft.commit();
			break;
		case R.id.d11:
			myFragment = new D11();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("First_fragment");
            ft.commit();
			break;
		case R.id.d12:
			myFragment = new D12();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("First_fragment");
            ft.commit();
			break;
		case R.id.d13:
			myFragment = new D13();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("First_fragment");
            ft.commit();
			break;
		case R.id.d14:
			myFragment = new D14();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("First_fragment");
            ft.commit();
			break;
		case R.id.d15:
			myFragment = new D15();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("First_fragment");
            ft.commit();
			break;
		case R.id.d16:
			myFragment = new D16();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("First_fragment");
            ft.commit();
			break;
		case R.id.d17:
			myFragment = new D17();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("First_fragment");
            ft.commit();
			break;
		case R.id.d18:
			myFragment = new D18();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("First_fragment");
            ft.commit();
			break;
		case R.id.d19:
			myFragment = new D19();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("First_fragment");
            ft.commit();
			break;
		case R.id.d20:
			myFragment = new D20();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("First_fragment");
            ft.commit();
			break;
		case R.id.d21:
			myFragment = new D21();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("First_fragment");
            ft.commit();
			break;
		case R.id.d22:
			myFragment = new D22();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("First_fragment");
            ft.commit();
			break;
		case R.id.d23:
			myFragment = new D23();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("First_fragment");
            ft.commit();
			break;
		case R.id.d24:
			myFragment = new D24();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("First_fragment");
            ft.commit();
			break;
		case R.id.d25:
			myFragment = new D25();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("First_fragment");
            ft.commit();
			break;
		case R.id.d26:
			myFragment = new D26();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("First_fragment");
            ft.commit();
			break;
		case R.id.d27:
			myFragment = new D27();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("First_fragment");
            ft.commit();
			break;
		case R.id.d28:
			myFragment = new D28();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("First_fragment");
            ft.commit();
			break;
		case R.id.d29:
			myFragment = new D29();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("First_fragment");
            ft.commit();
			break;
		case R.id.d30:
			myFragment = new D30();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("First_fragment");
            ft.commit();
			break;
		case R.id.d31:
			myFragment = new D31();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("First_fragment");
            ft.commit();
			break;
		case R.id.d32:
			myFragment = new D32();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("First_fragment");
            ft.commit();
			break;
		}
	}	
}