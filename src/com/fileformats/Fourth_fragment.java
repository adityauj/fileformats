package com.fileformats;
import com.fileformats.video.*;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class Fourth_fragment extends Fragment implements OnClickListener{
	View myView;
	Fragment myFragment = null;
	FragmentManager fm;
	FragmentTransaction ft;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		myView = inflater.inflate(R.layout.video, container, false);
		Button v1 = (Button)myView.findViewById(R.id.v1);
		v1.setOnClickListener(this);
		Button v2 = (Button)myView.findViewById(R.id.v2);
		v2.setOnClickListener(this);
		Button v3 = (Button)myView.findViewById(R.id.v3);
		v3.setOnClickListener(this);
		Button v4 = (Button)myView.findViewById(R.id.v4);
		v4.setOnClickListener(this);
		Button v5 = (Button)myView.findViewById(R.id.v5);
		v5.setOnClickListener(this);
		Button v6 = (Button)myView.findViewById(R.id.v6);
		v6.setOnClickListener(this);
		Button v7 = (Button)myView.findViewById(R.id.v7);
		v7.setOnClickListener(this);
		Button v8 = (Button)myView.findViewById(R.id.v8);
		v8.setOnClickListener(this);
		Button v9 = (Button)myView.findViewById(R.id.v9);
		v9.setOnClickListener(this);
		Button v10 = (Button)myView.findViewById(R.id.v10);
		v10.setOnClickListener(this);
		Button v11 = (Button)myView.findViewById(R.id.v11);
		v11.setOnClickListener(this);
		Button v12 = (Button)myView.findViewById(R.id.v12);
		v12.setOnClickListener(this);
		Button v13 = (Button)myView.findViewById(R.id.v13);
		v13.setOnClickListener(this);
		Button v14 = (Button)myView.findViewById(R.id.v14);
		v14.setOnClickListener(this);
		Button v15 = (Button)myView.findViewById(R.id.v15);
		v15.setOnClickListener(this);
		Button v16 = (Button)myView.findViewById(R.id.v16);
		v16.setOnClickListener(this);
		Button v17 = (Button)myView.findViewById(R.id.v17);
		v17.setOnClickListener(this);
		Button v18 = (Button)myView.findViewById(R.id.v18);
		v18.setOnClickListener(this);
		Button v19 = (Button)myView.findViewById(R.id.v19);
		v19.setOnClickListener(this);
		Button v20 = (Button)myView.findViewById(R.id.v20);
		v20.setOnClickListener(this);
		return myView;
	}
	@Override
	public void onClick(View v) {
		switch(v.getId())
		{
		case R.id.v1:
			myFragment = new V1();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fourth_fragment");
            ft.commit();
			break;
		case R.id.v2:
			myFragment = new V2();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fourth_fragment");
            ft.commit();
			break;
		case R.id.v3:
			myFragment = new V3();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fourth_fragment");
            ft.commit();
			break;
		case R.id.v4:
			myFragment = new V4();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fourth_fragment");
            ft.commit();
			break;
		case R.id.v5:
			myFragment = new V5();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fourth_fragment");
            ft.commit();
			break;
		case R.id.v6:
			myFragment = new V6();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fourth_fragment");
            ft.commit();
			break;
		case R.id.v7:
			myFragment = new V7();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fourth_fragment");
            ft.commit();
			break;
		case R.id.v8:
			myFragment = new V8();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fourth_fragment");
            ft.commit();
			break;
		case R.id.v9:
			myFragment = new V9();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fourth_fragment");
            ft.commit();
			break;
		case R.id.v10:
			myFragment = new V10();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fourth_fragment");
            ft.commit();
			break;
		case R.id.v11:
			myFragment = new V11();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fourth_fragment");
            ft.commit();
			break;
		case R.id.v12:
			myFragment = new V12();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fourth_fragment");
            ft.commit();
			break;
		case R.id.v13:
			myFragment = new V13();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fourth_fragment");
            ft.commit();
			break;
		case R.id.v14:
			myFragment = new V14();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fourth_fragment");
            ft.commit();
			break;
		case R.id.v15:
			myFragment = new V15();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fourth_fragment");
            ft.commit();
			break;
		case R.id.v16:
			myFragment = new V16();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fourth_fragment");
            ft.commit();
			break;
		case R.id.v17:
			myFragment = new V17();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fourth_fragment");
            ft.commit();
			break;
		case R.id.v18:
			myFragment = new V18();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fourth_fragment");
            ft.commit();
			break;
		case R.id.v19:
			myFragment = new V19();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fourth_fragment");
            ft.commit();
			break;
		case R.id.v20:
			myFragment = new V20();
			fm = getFragmentManager();
		    ft = fm.beginTransaction();
            ft.replace(R.id.container, myFragment);
            ft.addToBackStack("Fourth_fragment");
            ft.commit();
			break;
		}
	}
}
