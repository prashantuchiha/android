package com.example.newsapp;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webviewcontroller extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
