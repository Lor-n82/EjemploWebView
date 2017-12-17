package com.example.loren.ejemplowebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private String mUrl="http://disqus.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView web=(WebView)findViewById(R.id.miVisor);
        web.setWebViewClient(new MyWebViewClient());
        WebSettings settings = web.getSettings();
        web.loadUrl(mUrl);
    }

    private class MyWebViewClient extends WebViewClient{

        public boolean shouldOverrideUrlLoading(WebView view,String url){
            view.loadUrl(url);
            return true;
        }
    }
}
