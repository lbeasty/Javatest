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


class BaseTransaction 
{
  public	String		url;
  public	URLConnection	connection = null;

  public BaseTransaction(String getURL)
  {
    url	= getURL;
  }

  public void SetConnection()
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

  public void WriteToStream(String getStringToSend)
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

  public String ReadFromStream()
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

class BaseRequest
{
  public	Hashtable	hashtable;
  public	String		url;
  public	String		generatedUrl;

  public BaseRequest(String getURL)
  {
    url		= getURL;
    hashtable	= new Hashtable();
  }

  public void AddKeyValue(String getKey, String getValue)
  {
    hashtable.put( getKey, getValue );
  }

  public void GenerateUrl()
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

class ZipRequest extends BaseRequest
{
  public	String	zipcode;
  public	String	url;

  public ZipRequest(String getURL, String getZipcode)
  {
    super(getURL);
    url		= getURL;
    zipcode	= ValidateZip(getZipcode);
    AddKeyValue("zipcode", getZipcode);
  }

  public String ValidateZip(String getZipcode)
  {
    return getZipcode;
  }
}

class CityStateRequest extends BaseRequest
{
  public	String	city;
  public	String	state;
  public	String	url;

  public CityStateRequest(String getURL, String getCityState)
  {
//     ArrayList arrayList = new ArrayList();
    super(getURL);
    url		= getURL;

    ValidateCityState(getCityState);    
    AddKeyValue("city", city);
    AddKeyValue("state", state);
  }
  public void ValidateCityState(String getCityState)
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


class BaseResponse
{
  public	String	response;

  public BaseResponse(String getResponse)
  {
    response	= getResponse;
  }
}

// class JSONResponse extends BaseResponse
// {
//   public	String	jsonStringResponse;
//   public	Object	jsonClassMockup;
// 
//   public JSONResponse(String getResponse, Object getJsonClassMockup)
//   {
//     jsonStringResponse	= getResponse;
//     jsonClassMockup	= getJsonClassMockup;
//   }
// 
//   public jsonClassMockup.getClass() ValidateJSONResponse ()
//   {    
//     jsonClassMockup.getClass().getName() values = new Gson().fromJson(jsonStringResponse, jsonClassMockupobj.getClass());
// // .getName().class
// //     for (int counter = 0; counter < values.getTrends().length; counter++) {
// //       System.out.println(trends.getTrends(counter));
// //     }
//     return values;
//   }
// }

class Stores
{
  private	StoreDescription[]	storeDescription;

  public StoreDescription[] getStoreDescription()
  {
    return storeDescription;
  }

  public StoreDescription getStoreDescription(int counter)
  {
    return storeDescription[counter];
  }

  public void setStoreDescription(StoreDescription[] storeDescription)
  {
    this.storeDescription = storeDescription;
  }

  public String toString()
  {
    return "Count: " + storeDescription.length;
  }
}

class StoreDescription
{
  private int			storeId;
  private String		storeName;
  private String		addressLine1;
  private String		addressLine2;
  private String		addrCity;
  private String		addrState;
  private String		addrCountryCode;
  private int			addrPostalCode;
  private String		addrPhoneNumber;
  private StoreHours[]		storeHours;
  private StoreLocation[]	storeLocation;

  public int getStoreId()
  {
    return storeId;
  }

  public void setStoreId(int storeId)
  {
    this.storeId = storeId;
  }

  public String getStoreName()
  {
    return storeName;
  }

  public void setStoreName(String storeName)
  {
    this.storeName = storeName;
  }

  public String getAddressLine1()
  {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1)
  {
    this.addressLine1 = addressLine1;
  }

  public String getAddressLine2()
  {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2)
  {
    this.addressLine2 = addressLine2;
  }

  public String getAddrCity()
  {
    return addrCity;
  }

  public void setAddrCity(String addrCity)
  {
    this.addrCity = addrCity;
  }

  public String getAddrState()
  {
    return addrState;
  }

  public void setAddrState(String addrState)
  {
    this.addrState = addrState;
  }

  public String getAddrCountryCode()
  {
    return addrCountryCode;
  }

  public void setAddrCountryCode(String addrCountryCode)
  {
    this.addrCountryCode = addrCountryCode;
  }

  public int getAddrPostalCode()
  {
    return addrPostalCode;
  }

  public void setAddrPostalCode(int addrPostalCode)
  {
    this.addrPostalCode = addrPostalCode;
  }

  public String getAddrPhoneNumber()
  {
    return addrPhoneNumber;
  }

  public void setAddrPostalCode(String addrPhoneNumber)
  {
    this.addrPhoneNumber = addrPhoneNumber;
  }

  public StoreHours[] getStoreHours()
  {
    return storeHours;
  }

  public StoreHours getStoreHours(int counter)
  {
    return storeHours[counter];
  }

  public void setStoreHours(StoreHours[] storeHours)
  {
    this.storeHours = storeHours;
  }

  public StoreLocation[] getStoreLocation()
  {
    return storeLocation;
  }

  public StoreLocation getStoreLocation(int counter)
  {
    return storeLocation[counter];
  }

  public void setStoreLocation(StoreLocation[] storeLocation)
  {
    this.storeLocation = storeLocation;
  }

  public String toString()
  {
    String	hours		= "";

    for (int counter = 0; counter < getStoreHours().length; counter++)
    {
      hours += getStoreHours(counter) + "\n";
    }

    return "storeName: " + storeName + "; addressLine1: " + addressLine1 + "; addrCity: " + addrCity + "; addrState: " + addrState + "; hours: " + hours;
  }
// storeHours

/*{"storeId":177,"storeName":"Macy's Newpark Mall","addressLine1":"200 Newpark Mall","addressLine2":"","addrCity":"Newark","addrState":"","addrCountryCode":"USA ","addrPostalCode":"94560","addrPhoneNumber":"510-797-3333","storeHours":
      [{"storedate":"Tuesday, Mar 16","storeTime":"10:00AM - 09:00PM"},{"storedate":"Wednesday, Mar 17","storeTime":"10:00AM - 09:00PM"},{"storedate":"Thursday, Mar 18","storeTime":"10:00AM - 09:00PM"},{"storedate":"Friday, Mar 19","storeTime":"10:00AM - 09:00PM"},{"storedate":"Saturday, Mar 20","storeTime":"10:00AM - 09:00PM"}],
    "storeLocation":
      [{"storeLatitude":37.527927,"storeLongitude":-122.004517}]
    }*/
  static class StoreHours
  {
      private	String	storedate;
      private	String	storeTime;

      public String getStoredate()
      {
        return storedate;
      }

      public void setStoredate(String storedate)
      {
        this.storedate = storedate;
      }

      public String getStoreTime()
      {
        return storeTime;
      }

      public void setStoreTime(String storeTime)
      {
        this.storeTime = storeTime;
      }

      public String toString()
      {
        return "storeDate: " + storedate + "; storeTime: " + storeTime;
      }
    }

    static class StoreLocation
    {
      private	String	storeLatitude;
      private	String	storeLongitude;

      public String getStoreLatitude()
      {
        return storeLatitude;
      }

      public void setStoreLatitude(String storeLatitude)
      {
        this.storeLatitude = storeLatitude;
      }

      public String getStoreLongitude()
      {
        return storeLongitude;
      }

      public void setStoreLongitude(String storeLongitude)
      {
        this.storeLongitude = storeLongitude;
      }
    }
}

public class JavaSimpleApplication
{
  public	String	szAppName;

  public JavaSimpleApplication()
  {
    szAppName	= new String("Simple Console Application");
  }

  public static void main(String args[])
  {

    try
    {
      String	stringToReverse	= URLEncoder.encode(args[1], "UTF-8");

      BaseTransaction	trans	= null;
      if (args[1].indexOf(",") != -1)
      {
	  CityStateRequest	request	= new CityStateRequest(args[0], args[1]);
	  trans			= new BaseTransaction(request.generatedUrl);
      } 
      else
      {
	  ZipRequest		request	= new ZipRequest(args[0], args[1]);
	  trans			= new BaseTransaction(request.generatedUrl);
      }
      
      String	readString	= trans.ReadFromStream();

      BaseResponse	resp	= new BaseResponse(readString);
//       Stores		values	= resp.ValidateJSONResponse();

      Stores values = new Gson().fromJson(resp.response, Stores.class);

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



