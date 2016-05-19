package com.fileformats.video;

import com.fileformats.*;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class V2 extends Fragment{
	View myView;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		myView = inflater.inflate(R.layout.v2, container, false);
		return myView;
	}
}
