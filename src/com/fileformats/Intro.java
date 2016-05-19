package com.fileformats;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Intro extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.intro);
		Thread timer = new Thread(){
			public void run(){
				try{
					sleep(3000);
					startActivity(new Intent("com.fileformats.MAINACTIVITY"));
				}
				catch(Exception e){
					
				}
				finally{
					
				}
			}
		};
		timer.start();
		
		ImageButton b1 = (ImageButton)findViewById(R.id.intro);
		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent("com.fileformats.MAINACTIVITY"));
			}
		});
	}
}
