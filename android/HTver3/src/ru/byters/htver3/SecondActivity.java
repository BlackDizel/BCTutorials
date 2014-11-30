package ru.byters.htver3;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class SecondActivity extends Activity {

	String[] data = 
		{
			"fst",
			"scd",
			"thd"
		};
	
	ListView lv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		lv = (ListView)findViewById(R.id.lv);
		lv.setAdapter(new MyAdapter(this,data));
		
	}


}
