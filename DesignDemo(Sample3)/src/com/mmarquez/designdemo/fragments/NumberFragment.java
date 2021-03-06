package com.mmarquez.designdemo.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.mmarquez.desingdemo.activities.R;

public class NumberFragment extends Fragment {
	
	private TextView block;
	private Spinner spinner;
	private String[] listText = new String[]{"HackPR","1","2", "3","4", "Manuel"};
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_number, container, false);
		
		this.spinner = (Spinner) view.findViewById(R.id.spinner_number_frag);
		this.block =  (TextView) view.findViewById(R.id.block_number_frag);
		
		this.spinner.setAdapter(new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_dropdown_item_1line, listText));
		this.spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
		
				@Override
				public void onItemSelected(AdapterView<?> adapter, View view,
						int pos, long id) {
					changeText(spinner.getSelectedItem().toString());
					
				}
		
				@Override
				public void onNothingSelected(AdapterView<?> arg0) {
					//NoOp
					
				}
			});
			return view;
	}
	
	private void changeText(String string) {
		block.setText(string);
		
	}

}
