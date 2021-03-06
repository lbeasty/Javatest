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
  private	String	zipcode;
  private	String	url;

  public ZipRequest(String url, String zipcode)
  {
    super(url);

    this.url		= url;
    setZipcode(zipcode);
    addKeyValue("zipcode", zipcode);
  }

  public String getZipcode()
  {
    return zipcode;
  }

  public void setZipcode(String zipcode)
  {
    this.zipcode	= validateZip(zipcode);
  }

  public String getUrl()
  {
    return url;
  }

  public void setUrl(String url)
  {
    this.url	= url;
  }


  public String validateZip(String getZipcode)
  {
    return getZipcode;
  }
}