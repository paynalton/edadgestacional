package com.paynalton.com;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.content.Intent;

public class MainActivity extends Activity
{
	private EditText _fuView;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
	
	public void calcular(View view){
		_fuView=(EditText)findViewById(R.id.fondouterino);
		float fu=Float.parseFloat(_fuView.getText().toString());
		float resultado=(fu*8)/7;
		String resf=getResources().getString(R.string.sdg);
		((TextView)findViewById(R.id.resultado)).setText(String.format(resf,resultado));
	}
	public void abrirFaq(View view){
		Intent I = new Intent(this,faqActivity.class);
		startActivity(I);
	}
}
