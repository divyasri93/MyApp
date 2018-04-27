package com.example.bsetec.myapplication;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView bbbview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bbbview = (WebView) findViewById(R.id.bbbview);


        //added bb view

       // bbbview.getSettings().setJavaScriptEnabled(true);
       // bbbview.getSettings().setDomStorageEnabled(true);


        bbbview.loadUrl("https://test.bigbluebutton.org/");
       bbbview.setWebViewClient(new myWebClient());

        bbbview.requestFocusFromTouch();

    //    bbbview.setWebChromeClient(new WebChromeClient());


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }


    public class myWebClient extends WebViewClient {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            // TODO Auto-generated method stub
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            // TODO Auto-generated method stub

            view.loadUrl(url);
            System.out.println("listen url : " + url);


            return true;

        }

        @Override
        public void onPageFinished(WebView view, String url) {
            // TODO Auto-generated method stub
            super.onPageFinished(view, url);


        }
    }



}
