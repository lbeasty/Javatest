package app;

import java.util.*;

// import com.google.gson.Gson;
import com.google.gson.*;

import java.net.*;
import java.io.*;
import java.lang.*;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.net.URL;
public class BaseRequest
{
  public	Hashtable	hashtable;
  public	String		url;
  public	String		generatedUrl;

  public BaseRequest(String getURL)
  {
    url		= getURL;
    hashtable	= new Hashtable();
  }

  public void addKeyValue(String getKey, String getValue)
  {
    hashtable.put( getKey, getValue );
  }

  public void generateUrl()
  {
    Set		s	= hashtable.entrySet();
    Iterator	it	= s.iterator();
    String	str	= "";

    while(it.hasNext())
    {
      Map.Entry	m =(Map.Entry)it.next();
      String	key=(String)m.getKey();
      String	value=(String)m.getValue();
      str	= str + key + "=" + value + "&";
    }

    generatedUrl	= str;
  }
}
