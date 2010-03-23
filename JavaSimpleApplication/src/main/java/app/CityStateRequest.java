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
  public	String	city;
  public	String	state;
  public	String	url;

  public CityStateRequest(String getURL, String getCityState)
  {
//     ArrayList arrayList = new ArrayList();
    super(getURL);
    url		= getURL;

    validateCityState(getCityState);    
    addKeyValue("city", city);
    addKeyValue("state", state);
  }

  public void validateCityState(String getCityState)
  {
    String [] temp	= null;
    temp		= getCityState.split(",");
    city		= temp[0];
    state		= temp[1];

//       String s3 = "Real  How To";
//       String [] temp = null;
//       temp = s3.split("\\s+");


//  arrayList.add( new Integer(1) ); // adding value into ArrayList
  }
}