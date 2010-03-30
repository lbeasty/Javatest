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

public class JavaSimpleApplication
{
//   public	String	szAppName;
// 
//   public JavaSimpleApplication()
//   {
//     szAppName	= new String("Simple Console Application");
//   }

  public BaseTransaction parseRequest (String url, String request) 
  {
      BaseTransaction	trans	= null;
      if (request.indexOf(",") != -1)
      {
	  CityStateRequest	req	= new CityStateRequest(url, request);
	  trans			= new BaseTransaction(req.generateUrl());
      } 
      else
      {
	  ZipRequest		req	= new ZipRequest(url, request);
	  trans			= new BaseTransaction(req.generateUrl());
      }
      return trans;
  }

  public void main(String args[])
  {

    try
    {
      String	stringToReverse	= URLEncoder.encode(args[1], "UTF-8");
      BaseTransaction	trans = parseRequest(args[0], args[1]);
      
      String	readString	= trans.readFromStream();

      BaseResponse	resp	= new BaseResponse(readString);
//       Stores		values	= resp.ValidateJSONResponse();

      Stores values = new Gson().fromJson(resp.response, Stores.class);
// Integer one = gson.fromJson("1", Integer.class);
      for (int counter = 0; counter < values.getStoreDescription().length; counter++)
      {
	System.out.println(values.getStoreDescription(counter));
      }
// https://services.macys.com:4443/store_locator?zipcode=94538
// https://services.macys.com:4443/store_locator?state=ca&city=san%20francisco
    } 
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }

}



