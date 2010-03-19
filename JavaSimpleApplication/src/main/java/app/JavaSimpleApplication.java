package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Hashtable;

import java.util.Enumeration;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;


class BaseTransaction {
  public String url;
  public URLConnection connection = null;

  public BaseTransaction(String getURL)
  {
    url = getURL;
  }

  public SetConnection()
  {
    URL urlURL = new URL(url);
    URLConnection connection = urlURL.openConnection();
  }

  public WriteToStream(String getStringToSend)
  {
    OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
    out.write(getStringToSend);
    out.close();
  }

  public ReadFromStream()
  {
    BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
    String inputLine;
    StringBuffer buffer = new StringBuffer();
    while ((inputLine = in.readLine()) != null) {
      buffer.append(inputLine);
    }
    in.close();
    return buffer.toString();
  }

}

class BaseRequest {
  public Hashtable hashtable;
  public String url;
  public String generatedUrl;

  public BaseRequest(String getURL)
  {
    url = getURL;
    hashtable = new Hashtable();
  }
  public AddKeyValue(String getKey, String getValue)
  {
    hashtable.put( getKey, getValue );
  }
  public GenerateUrl()
  {
    Set s=mp.entrySet();
    Iterator it=s.iterator();
    String str = "";
    while(it.hasNext())
    {
      Map.Entry m =(Map.Entry)it.next();
      String key=(String)m.getKey();
      String value=(String)m.getValue();
      str = str + key + "=" + value + "&";
    }
    generatedUrl = str;
  }
}

class ZipRequest extends BaseRequest {
  public String zipcode;
  public String url;

  public ZipRequest(String getURL, String getZipcode)
  {
    url = getURL;
    zipcode = ValidateZip(getZipcode);
    super(url);
    AddKeyValue("zipcode", getZipcode);
  }
  public ValidateZip(String getZipcode)
  {
    return getZipcode;
  }
}

class CityStateRequest extends BaseRequest {
  public String zipcode;
  public String url;

  public CityStateRequest(String getURL, String getCityState)
  {
    url = getURL;
    city, state = ValidateCityState(getCityState);
    super(url);
    AddKeyValue("city", city);
    AddKeyValue("state", state);
  }
  public ValidateCityState(String getCityState)
  {
    return getCityState;
  }
}


class BaseResponse
{
  public String response;

  public BaseResponse(String getResponse)
  {
    response = getResponse;
  }
}

class JSONResponse extends BaseResponse
{
  public String jsonStringResponse;
  public Object jsonClassMockup;

  public JSONResponse(String getResponse, Object getJsonClassMockup)
  {
    jsonStringResponse = getResponse;
    jsonClassMockup = getJsonClassMockup;
  }
  public ValidateJSONResponse ()
  {    
    jsonClassMockup values = new Gson().fromJson(getResponse, jsonClassMockup.class);
//     for (int counter = 0; counter < values.getTrends().length; counter++) {
//       System.out.println(trends.getTrends(counter));
//     }
    return values;
  }
}

class Stores {
  private StoreDescription[] storeDescription;

  public StoreDescription[] getStoreDescription() {
    return storeDescription;
  }

  public StoreDescription getStoreDescription(int counter) {
    return storeDescription[counter];
  }

  public void setStoreDescription(StoreDescription[] storeDescription) {
    this.storeDescription = storeDescription;
  }

  public String toString() {
    return "Count: " + storeDescription.length;
  }
}

class StoreDescription {
  private int storeId;
  private String storeName;
  private String addressLine1;
  private String addressLine2;
  private String addrCity;
  private String addrState;
  private String addrCountryCode;
  private int addrPostalCode;
  private String addrPhoneNumber;
  private StoreHours[] storeHours;
  private StoreLocation[] storeLocation;

  public int getStoreId() {
    return storeId;
  }

  public void setStoreId(int storeId) {
    this.storeId = storeId;
  }

  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public String getAddrCity() {
    return addrCity;
  }

  public void setAddrCity(String addrCity) {
    this.addrCity = addrCity;
  }

  public String getAddrState() {
    return addrState;
  }

  public void setAddrState(String addrState) {
    this.addrState = addrState;
  }

  public String getAddrCountryCode() {
    return addrCountryCode;
  }

  public void setAddrCountryCode(String addrCountryCode) {
    this.addrCountryCode = addrCountryCode;
  }

  public int getAddrPostalCode() {
    return addrPostalCode;
  }

  public void setAddrPostalCode(int addrPostalCode) {
    this.addrPostalCode = addrPostalCode;
  }

  public String getAddrPhoneNumber() {
    return addrPhoneNumber;
  }

  public void setAddrPostalCode(String addrPhoneNumber) {
    this.addrPhoneNumber = addrPhoneNumber;
  }

  public StoreHours[] getStoreHours() {
    return storeHours;
  }

  public StoreHours getStoreHours(int counter) {
    return storeHours[counter];
  }

  public void setStoreHours(StoreHours[] storeHours) {
    this.storeHours = storeHours;
  }

  public StoreLocation[] getStoreLocation() {
    return storeLocation;
  }

  public StoreLocation getStoreLocation(int counter) {
    return storeLocation[counter];
  }

  public void setStoreLocation(StoreLocation[] storeLocation) {
    this.storeLocation = storeLocation;
  }

  public String toString() {
    hours = ""
    for (int counter = 0; counter < storeHours.getStoreHours().length; counter++) {
      hours += storeHours.getStoreHours(counter) + "\n";
    }
    return "storeName: " + storeName + "; addressLine1: " + addressLine1 + "; addrCity: " + addrCity + "; addrState: " + addrState + "; hours: " + hours;
  }
// storeHours

/*{"storeId":177,"storeName":"Macy's Newpark Mall","addressLine1":"200 Newpark Mall","addressLine2":"","addrCity":"Newark","addrState":"","addrCountryCode":"USA ","addrPostalCode":"94560","addrPhoneNumber":"510-797-3333","storeHours":
      [{"storedate":"Tuesday, Mar 16","storeTime":"10:00AM - 09:00PM"},{"storedate":"Wednesday, Mar 17","storeTime":"10:00AM - 09:00PM"},{"storedate":"Thursday, Mar 18","storeTime":"10:00AM - 09:00PM"},{"storedate":"Friday, Mar 19","storeTime":"10:00AM - 09:00PM"},{"storedate":"Saturday, Mar 20","storeTime":"10:00AM - 09:00PM"}],
    "storeLocation":
      [{"storeLatitude":37.527927,"storeLongitude":-122.004517}]
    }*/
 
//   public StoreDescription(
// 			  int getStoreId,
// 			  String getStoreName,
// 			  String getAddressLine1,
// 			  String getAddressLine2,
// 			  String getAddrCity,
// 			  String getAddrState,
// 			  String getAddrCountryCode,
// 			  int getAddrPostalCode,
// 			  String getAddrPhoneNumber,
// 			  List getStoreHours,
// 			  List getStoreLocation,)
//   {
//     storeId = getStoreId;
//     storeName = getStoreName;
//     addressLine1 = getAddressLine1;
//     addressLine2 = getAddressLine2;
//     addrCity = getAddrCity;
//     addrState = getAddrState;
//     addrCountryCode = getAddrCountryCode;
//     addrPostalCode = getAddrPostalCode;
//     addrPhoneNumber = getAddrPhoneNumber;
//     storeHours = getStoreHours;
//     storeLocation = getStoreLocation;
//   }
    static class StoreHours {
      private String storedate;
      private String storeTime;

      public String getStoredate() {
        return storedate;
      }

      public void setStoredate(String storedate) {
        this.storedate = storedate;
      }

      public String getStoreTime() {
        return storeTime;
      }

      public void setStoreTime(String storeTime) {
        this.storeTime = storeTime;
      }

      public String toString() {
        return "storeDate: " + storedate + "; storeTime: " + storeTime;
      }
    }

    static class StoreLocation {
      private String storeLatitude;
      private String storeLongitude;

      public String getStoreLatitude() {
        return storeLatitude;
      }

      public void setStoreLatitude(String storeLatitude) {
        this.storeLatitude = storeLatitude;
      }

      public String getStoreLongitude() {
        return storeLongitude;
      }

      public void setStoreLongitude(String storeLongitude) {
        this.storeLongitude = storeLongitude;
      }

    }


}

public class JavaSimpleApplication
{
  String szAppName;

  public JavaSimpleApplication()
  {
    szAppName = new String("Simple Console Application");
  }

  public static void main(String args[])
  {

    try {
      String stringToReverse = URLEncoder.encode(args[1], "UTF-8");
      ZipRequest zipRequest = ZipRequest(args[0], args[1]);
      BaseTransaction trans = BaseTransaction(zipRequest.generatedUrl);
      readString = trans.ReadFromStream();

      JSONResponse resp = JSONResponse(readString, Stores);
      Stores values = resp.ValidateJSONResponse();
      for (int counter = 0; counter < values.getStoreDescription().length; counter++) {
	System.out.println(values.getStoreDescription(counter));
      }

// https://services.macys.com:4443/store_locator?zipcode=94538
// https://services.macys.com:4443/store_locator?state=ca&city=san%20francisco


    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}



