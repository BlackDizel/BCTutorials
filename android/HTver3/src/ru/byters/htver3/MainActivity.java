package ru.byters.htver3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	Button b;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		b=(Button)findViewById(R.id.bt);
		b.setOnClickListener(this);
		/*
				
				
				new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(),SecondActivity.class);
				startActivity(i);
			}
		});
		*/
		
	}
	
	@Override
	public void onClick(View v) {
		switch (v.getId())
		{
		case R.id.bt:
			Intent i = new Intent(this,SecondActivity.class);
			startActivity(i);
		
			break;
/*
		case R.id.bt2:
			break;
*/
		}
		// TODO Auto-generated method stub
		
	}

	
}
