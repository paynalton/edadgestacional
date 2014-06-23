package com.paynalton.com;

import android.app.*;
import android.os.*;
import android.webkit.WebView;

public class faqActivity  extends Activity{
	String index="file:///android_asset/faq/index.html";
	WebView visor;
	public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faq);
        visor=(WebView) findViewById(R.id.main);
        visor.loadUrl(index);
    }
	
}
