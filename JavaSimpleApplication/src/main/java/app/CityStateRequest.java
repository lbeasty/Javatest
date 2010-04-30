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


public class CityStateRequest extends BaseRequest
{
  private	String	city;
  private	String	state;
  private	String	url;

  public CityStateRequest(String url, String citystate)
  {
//     ArrayList arrayList = new ArrayList();
    super(url);
    this.url		= url;

    setCity(citystate);
    setState(citystate);
    addKeyValue("city", city);
    addKeyValue("state", state);
  }

  public String getUrl()
  {
    return url;
  }

  public void setUrl(String url)
  {
    this.url	= url;
  }

  public String getCity()
  {
    return city;
  }

  public void setCity(String citystate)
  {
    this.city	= validateCityState(citystate)[0];
  }

  public String getState()
  {
    return state;
  }

  public void setState(String citystate)
  {
    this.state	= validateCityState(citystate)[1];
  }

  public String [] validateCityState(String getCityState)
  {
    String [] temp	= null;
    temp		= getCityState.toLowerCase().split(",");

    return temp;

  }
}