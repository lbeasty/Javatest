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
public class BaseTransaction 
{
  public	String		url;
  public	URLConnection	connection = null;

  public BaseTransaction(String getURL)
  {
    url	= getURL;
  }

  public void setConnection()
  {
    URL	urlURL	= null;
    try
    {
      urlURL	= new URL(url);
    }
    catch (MalformedURLException e)
    {
      e.printStackTrace();
    }

    try
    {
      connection	= urlURL.openConnection();
    } 
    catch (IOException e)
    {
      e.printStackTrace();
    }

  }

  public void writeToStream(String getStringToSend)
  {
    OutputStreamWriter	out	= null;
    try
    {
      out	= new OutputStreamWriter(connection.getOutputStream());
      out.write(getStringToSend);
      out.close();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }

  public String readFromStream()
  {
    StringBuffer	buffer	= null;
    try
    {
      BufferedReader	in	= new BufferedReader(new InputStreamReader(connection.getInputStream()));
      String		inputLine;
      buffer	= new StringBuffer();

      while ((inputLine = in.readLine()) != null)
      {
	buffer.append(inputLine);
      }

      in.close();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }

    return buffer.toString();
  }

}