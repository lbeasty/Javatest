package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


class BaseRequest {
  public String request;

  public BaseRequest(String getRequest)
  {
    request = getRequest;
  }

  public String getRequest() {
      return request;
  }
  public void setRequest(String variable) {
      this.request = variable;
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

class StoreDescription {
  public int storeId;
  public String storeName;
  public String addressLine1;
  public String addressLine2;
  public String addrCity;
  public String addrState;
  public String addrCountryCode;
  public int addrPostalCode;
  public String addrPhoneNumber;
  public List storeHours;
  public List storeLocation;

/*{"storeId":177,"storeName":"Macy's Newpark Mall","addressLine1":"200 Newpark Mall","addressLine2":"","addrCity":"Newark","addrState":"","addrCountryCode":"USA ","addrPostalCode":"94560","addrPhoneNumber":"510-797-3333","storeHours":
      [{"storedate":"Tuesday, Mar 16","storeTime":"10:00AM - 09:00PM"},{"storedate":"Wednesday, Mar 17","storeTime":"10:00AM - 09:00PM"},{"storedate":"Thursday, Mar 18","storeTime":"10:00AM - 09:00PM"},{"storedate":"Friday, Mar 19","storeTime":"10:00AM - 09:00PM"},{"storedate":"Saturday, Mar 20","storeTime":"10:00AM - 09:00PM"}],
    "storeLocation":
      [{"storeLatitude":37.527927,"storeLongitude":-122.004517}]
    }*/
 
  public StoreDescription(
			  int getStoreId,
			  String getStoreName,
			  String getAddressLine1,
			  String getAddressLine2,
			  String getAddrCity,
			  String getAddrState,
			  String getAddrCountryCode,
			  int getAddrPostalCode,
			  String getAddrPhoneNumber,
			  List getStoreHours,
			  List getStoreLocation,)
  {
    storeId = getStoreId;
    storeName = getStoreName;
    addressLine1 = getAddressLine1;
    addressLine2 = getAddressLine2;
    addrCity = getAddrCity;
    addrState = getAddrState;
    addrCountryCode = getAddrCountryCode;
    addrPostalCode = getAddrPostalCode;
    addrPhoneNumber = getAddrPhoneNumber;
    storeHours = getStoreHours;
    storeLocation = getStoreLocation;
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
    int i = 0;
    byte bKbd[] = new byte[256];
    String szStr = "";
    StringTokenizer st;

    JavaSimpleApplication sc = new JavaSimpleApplication();
    System.out.println(sc.szAppName);
    System.out.print("Enter number: ");

    try
    {
      int iCnt = System.in.read(bKbd);
      szStr = new String(bKbd, 0, iCnt);
	  
      st = new StringTokenizer(szStr, "\r\n");
      szStr = 
	new String((String)st.nextElement());
	  
      Integer intVal = new Integer(szStr);
      i = intVal.intValue();
    }
    catch(Exception ex)
    {
      System.out.println(ex.toString()); 
    }
  }
}


