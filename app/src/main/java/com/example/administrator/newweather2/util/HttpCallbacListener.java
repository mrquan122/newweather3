package com.example.administrator.newweather2.util;

import org.json.JSONException;
import org.xml.sax.SAXException;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;

/**
 * Created by Administrator on 2016/3/20.
 */
  public interface HttpCallbacListener {
    void onFinish(InputStream response) throws IOException, XmlPullParserException, ParserConfigurationException, SAXException, JSONException;
    void onError(Exception e);
   }
