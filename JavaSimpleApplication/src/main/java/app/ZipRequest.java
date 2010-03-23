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


public class ZipRequest extends BaseRequest
{
  public	String	zipcode;
  public	String	url;

  public ZipRequest(String getURL, String getZipcode)
  {
    super(getURL);
    url		= getURL;
    zipcode	= validateZip(getZipcode);
    addKeyValue("zipcode", getZipcode);
  }

  public String validateZip(String getZipcode)
  {
    return getZipcode;
  }
}