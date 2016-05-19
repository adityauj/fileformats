package com.fileformats;

import com.fileformats.images.*;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Second_fragment extends Fragment implements OnClickListener{
	Fragment myFragment = null;
	FragmentManager fm;
	FragmentTransaction ft;
	View myView;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		myView = inflater.inflate(R.layout.image, container, false);
		Button i1 = (Button)myView.findViewById(R.id.i1);
		i1.setOnClickListener(this);
		Button i2 = (Button)myView.findViewById(R.id.i2);
		i2.setOnClickListener(this);
		Button i3 = (Button)myView.findViewById(R.id.i3);
		i3.setOnClickListener(this);
		Button i4 = (Button)myView.findViewById(R.id.i4);
		i4.setOnClickListener(this);
		Button i5 = (Button)myView.findViewById(R.id.i5);
		i5.setOnClickListener(this);
		Button i6 = (Button)myView.findViewById(R.id.i6);
		i6.setOnClickListener(this);
		Button i7 = (Button)myView.findViewById(R.id.i7);
		i7.setOnClickListener(this);
		Button i8 = (Button)myView.findViewById(R.id.i8);
		i8.setOnClickListener(this);
		Button i9 = (Button)myView.findViewById(R.id.i9);
		i9.setOnClickListener(this);
		Button i10 = (Button)myView.findViewById(R.id.i10);
		i10.setOnClickListener(this);
		Button i11 = (Button)myView.findViewById(R.id.i11);
		i11.setOnClickListener(this);
		Button i12 = (Button)myView.findViewById(R.id.i12);
		i12.setOnClickListener(this);
		Button i13 = (Button)myView.findViewById(R.id.i13);
		i13.setOnClickListener(this);
		Button i14 = (Button)myView.findViewById(R.id.i14);
		i14.setOnClickListener(this);
		Button i15 = (Button)myView.findViewById(R.id.i15);
		i15.setOnClickListener(this);
		Button i16 = (Button)myView.findViewById(R.id.i16);
		i16.setOnClickListener(this);
		Button i17 = (Button)myView.findViewById(R.id.i17);
		i17.setOnClickListener(this);
		Button i18 = (Button)myView.findViewById(R.id.i18);
		i18.setOnClickListener(this);
		Button i19 = (Button)myView.findViewById(R.id.i19);
		i19.setOnClickListener(this);
		Button i20 = (Button)myView.findViewById(R.id.i20);
		i20.setOnClickListener(this);
		Button i21 = (Button)myView.findViewById(R.id.i21);
		i21.setOnClickListener(this);
		Button i22 = (Button)myView.findViewById(R.id.i22);
		i22.setOnClickListener(this);
		Button i23 = (Button)myView.findViewById(R.id.i23);
		i23.setOnClickListener(this);
		Button i24 = (Button)myView.findViewById(R.id.i24);
		i24.setOnClickListener(this);
		Button i25 = (Button)myView.findViewById(R.id.i25);
		i25.setOnClickListener(this);
		Button i26 = (Button)myView.findViewById(R.id.i26);
		i26.setOnClickListener(this);
		Button i27 = (Button)myView.findViewById(R.id.i27);
		i27.setOnClickListener(this);
		Button i28 = (Button)myView.findViewById(R.id.i28);
		i28.setOnClickListener(this);
		Button i29 = (Button)myView.findViewById(R.id.i29);
		i29.setOnClickListener(this);
		Button i30 = (Button)myView.findViewById(R.id.i30);
		i30.setOnClickListener(this);
		Button i31 = (Button)myView.findViewById(R.id.i31);
		i31.setOnClickListener(this);
		Button i32 = (Button)myView.findViewById(R.id.i32);
		i32.setOnClickListener(this);
		Button i33 = (Button)myView.findViewById(R.id.i33);
		i33.setOnClickListener(this);
		Button i34 = (Button)myView.findViewById(R.id.i34);
		i34.setOnClickListener(this);
		Button i35 = (Button)myView.findViewById(R.id.i35);
		i35.setOnClickListener(this);
		Button i36 = (Button)myView.findViewById(R.id.i36);
		i36.setOnClickListener(this);
		return myView;
	}
	@Override
	public void onClick(View v) {
	switch(v.getId())
	{
	case R.id.i1:
		myFragment = new I1();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i2:
		myFragment = new I2();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i3:
		myFragment = new I3();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i4:
		myFragment = new I4();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i5:
		myFragment = new I5();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i6:
		myFragment = new I6();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i7:
		myFragment = new I7();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i8:
		myFragment = new I8();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i9:
		myFragment = new I9();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i10:
		myFragment = new I10();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i11:
		myFragment = new I11();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i12:
		myFragment = new I12();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i13:
		myFragment = new I13();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i14:
		myFragment = new I14();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i15:
		myFragment = new I15();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i16:
		myFragment = new I16();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i17:
		myFragment = new I17();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i18:
		myFragment = new I18();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i19:
		myFragment = new I19();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i20:
		myFragment = new I20();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i21:
		myFragment = new I21();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i22:
		myFragment = new I22();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i23:
		myFragment = new I23();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i24:
		myFragment = new I24();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i25:
		myFragment = new I25();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i26:
		myFragment = new I26();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i27:
		myFragment = new I27();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i28:
		myFragment = new I28();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i29:
		myFragment = new I29();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i30:
		myFragment = new I30();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i31:
		myFragment = new I31();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i32:
		myFragment = new I32();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i33:
		myFragment = new I33();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i34:
		myFragment = new I34();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i35:
		myFragment = new I35();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	case R.id.i36:
		myFragment = new I36();
		fm = getFragmentManager();
	    ft = fm.beginTransaction();
        ft.replace(R.id.container, myFragment);
        ft.addToBackStack("Second_fragment");
        ft.commit();
		break;
	}
	}
}
