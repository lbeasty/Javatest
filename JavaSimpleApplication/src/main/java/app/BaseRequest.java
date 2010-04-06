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
  private	Map<String, String>	requestParams;
  private	String			url;
  

  public BaseRequest(String url)
  {
    this.url		= url;
    setRequestParams();
  }

  public Map<String, String> getRequestParams()
  {
    return requestParams;
  }

  public void setRequestParams()
  {
    this.requestParams = new HashMap<String, String>();
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
    requestParams.put( getKey, getValue );
  }

  public String generateUrl()
  {
    String				generatedUrl;
    Set<Map.Entry<String, String>>	s	= requestParams.entrySet();
    Iterator<Map.Entry<String, String>>	it	= s.iterator();
    String				str	= "";

    while(it.hasNext())
    {
      Map.Entry<String, String>	m =it.next();
      String	key=m.getKey();
      String	value=m.getValue();
      str	= str + key + "=" + value + "&";
    }

    generatedUrl	= url + str;
    return generatedUrl;
  }
}
