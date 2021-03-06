package org.cimbingguide.gui;

import java.util.Calendar;

import org.json.JSONException;
import org.json.JSONObject;

import com.example.climbingguide.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CreateSector extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.create_sector);

		Button b1 = (Button) findViewById(R.id.button1);
		
		b1.setOnClickListener(onClickListener);
	}
	
	private OnClickListener onClickListener = new OnClickListener() {
	     @Override
	     public void onClick(final View v) {
	    	EditText e1   = (EditText)findViewById(R.id.editText1);
		 	EditText e2   = (EditText)findViewById(R.id.editText2);
		 	TextView v1 = (TextView)findViewById(R.id.textView1);
			TextView v2 = (TextView)findViewById(R.id.textView2);
	 		JSONObject json = new JSONObject();
	 		
	 		Calendar c = Calendar.getInstance();
	 	    int mYear = c.get(Calendar.YEAR);
	 	    int mMonth = c.get(Calendar.MONTH);
	 	    int mDay = c.get(Calendar.DAY_OF_MONTH);
	 	    String date = (new StringBuilder()
	 	    .append(mYear)
	 	    .append(mMonth + 1)
	 	    .append(mDay)).toString();
	 	    
	    	try {
				json.put("sector_name", e1.getText().toString());
				json.put("area", e2.getText().toString());
				json.put("date", date);
			} catch (JSONException e) {
				e.printStackTrace();
			}
			
	     }
	};

}
