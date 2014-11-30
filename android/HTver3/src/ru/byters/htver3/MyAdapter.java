package ru.byters.htver3;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter  {

	LayoutInflater lInflater;
	
	String[] data;
	public MyAdapter(Context ctx, String[] data)
	{
		lInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		this.data=data;
	}
	
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return data.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return data[arg0];
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int position, View view, ViewGroup parent) 
	{
		if (view == null) view = lInflater.inflate(R.layout.listitem, parent, false);
	    
		TextView tv = (TextView)view.findViewById(R.id.tv);
		if (tv!=null)
		tv.setText(data[position]);
		Log.v("MyConf",data[position]);
		return view;
	}




}
