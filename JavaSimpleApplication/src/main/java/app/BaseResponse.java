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


public class BaseResponse
{
  private	String	response;

  public BaseResponse(String response)
  {
    this.response	= response;
  }

  public String getResponse()
  {
    return response;
  }

  public void setResponse(String response)
  {
    this.response = response;
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