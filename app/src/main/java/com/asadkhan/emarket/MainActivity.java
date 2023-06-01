package com.asadkhan.emarket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView eMarket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eMarket = findViewById(R.id.eMarket);

        eMarket.getSettings().setJavaScriptEnabled(true);
        eMarket.loadUrl("https://ecommerce.bongotech.xyz/");
        //eMarket.loadUrl("https://www.youtube.com/embed/pCaf9WfDD6s");

    }
}