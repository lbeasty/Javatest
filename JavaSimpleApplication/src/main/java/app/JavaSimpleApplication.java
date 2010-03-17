package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;


class BaseRequest {
  public String request;
  public URL url;
  public URLConnection connection;

  public BaseRequest(String getURL, String getRequest)
  {
    request = getRequest;
    url = new URL(getURL);
    connection = url.openConnection();
    connection.setDoOutput(true);

//       HttpURLConnection connection = null;
//       OutputStreamWriter wr = null;
//       BufferedReader rd  = null;
//       StringBuilder sb = null;
//       String line = null;
//     
//       URL serverAddress = null;
//     
//       try {
//           serverAddress = new URL("http://localhost");
//           //set up out communications stuff
//           connection = null;
//         
//           //Set up the initial connection
//           connection = (HttpURLConnection)serverAddress.openConnection();

  }
  public StreamWriter(String stringToReverse)
  {
    OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
    out.write("string=" + stringToReverse);
    out.close();
  }

}

class ValidateRequest extends BaseRequest {
  public String valRequest;
 
  public ValidateRequest(String getRequest){
    valRequest = checkRequest(getRequest);
    super(valRequest);
  }

  public String checkRequest(String getRequest){
    String checkedRequest = getRequest;
    return checkedRequest;
  }		
}

class BaseResponse {
  public Object response;

  public BaseResponse(Object szResponse)
  {
    response = szResponse;
  }
  public Object getResponse() {
      return response;
  }
  public void setResponse(Object variable) {
      this.response = variable;
  }

}

class ValidateResponse extends BaseResponse {
  public Object valResponse;
 
  public ValidateRequest(Object getRequest){
    valRequest = checkRequest(getRequest);
    super(valRequest);
  }

  public String checkRequest(Object getRequest){
    Object checkedRequest = getRequest;
    return checkedRequest;
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
    return "Trends at " + as_of + ". Count: " + trends.length;
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

//   public static final String TWITTER_TRENDS_URL = "search.twitter.com/trends.json";
    StringBuffer buffer = null;
    try {
	String stringToReverse = URLEncoder.encode(args[0], "UTF-8");

// https://services.macys.com:4443/store_locator?zipcode=94538
// https://services.macys.com:4443/store_locator?state=ca&city=san%20francisco

	URL url = new URL("");
	URLConnection connection = url.openConnection();
	connection.setDoOutput(true);

	OutputStreamWriter out = new OutputStreamWriter(
                              connection.getOutputStream());
	out.write("string=" + stringToReverse);
	out.close();

    } catch (IOException e) {
      e.printStackTrace();
    }

    StringBuffer buffer = null;
    try {
      URL url = new URL(TWITTER_TRENDS_URL);
      BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
      String inputLine;
      buffer = new StringBuffer();
      while ((inputLine = in.readLine()) != null) {
        buffer.append(inputLine);
      }
      in.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

    TwitterTrends trends = new Gson().fromJson(buffer.toString(), TwitterTrends.class);
    for (int counter = 0; counter < trends.getTrends().length; counter++) {
      System.out.println(trends.getTrends(counter));
    }
  }
}



