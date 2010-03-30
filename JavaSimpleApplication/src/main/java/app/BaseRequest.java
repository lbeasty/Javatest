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
  private	Hashtable	hashtable;
  private	String		url;
  

  public BaseRequest(String url)
  {
    setUrl(url);
    setHashtable();
  }

  public Hashtable getHashtable()
  {
    return hashtable;
  }

  public void setHashtable()
  {
    this.hashtable	= new Hashtable();
  }

  public String getUrl()
  {
    return url;
  }

  public void setUrl(String url)
  {
    this.url	= url;
  }


  public void addKeyValue(String getKey, String getValue)
  {
    hashtable.put( getKey, getValue );
  }

  public String generateUrl()
  {
    String	generatedUrl;
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

    generatedUrl	= url + str;
    return generatedUrl;
  }
}
