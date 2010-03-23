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