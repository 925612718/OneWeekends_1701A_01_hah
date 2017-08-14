package com.liu.administratorexample.oneweekends_1701a_01.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.liu.administratorexample.oneweekends_1701a_01.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class CFragment extends Fragment {


    private WebView webview;
    String url="http://baike.baidu.com/view/22512.htm";
    public CFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_c, container, false);
        webview = (WebView) view.findViewById(R.id.webview);
//        WebSettings settings = webview.getSettings();
//        settings.setJavaScriptEnabled(true);
//        settings.setSupportZoom(true);
//        settings.setDefaultTextEncodingName("utf-8");
        //webview.loadUrl(url);
        return view;
    }


}
