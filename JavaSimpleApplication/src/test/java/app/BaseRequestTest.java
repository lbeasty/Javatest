package app;
// import junit.framework.Test;
// import junit.framework.TestCase;
// import junit.framework.TestSuite;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.*;

public class BaseRequestTest {

//   public	Hashtable	hashtable;
//   public	String		url;
//   public	String		generatedUrl; 
//   public BaseRequest(String getURL)
//   {
//     url		= getURL;
//     hashtable	= new Hashtable();
//   }
//   public void addKeyValue(String getKey, String getValue)
//   public void generateUrl()

//     @Test public void parseShouldReturnZipcodeHTTPParamIfZipcodeIsGiven() {
//         Parser p = new Parser();
//         String actual = p.parse("94538");
//         assertThat(actual, equalTo("zipcode=94538"));
//     }


    @Test public void callConstructor() {
      String myURL = "http://www.google.ru";
      BaseRequest request = new BaseRequest(myURL);
      String actual = request.getUrl();
      assertThat(actual, equalTo(myURL));
    }

    @Test public void addKeyValue() {
      String myURL = "http://www.google.ru";
      BaseRequest request = new BaseRequest(myURL);
      assertThat(request.getHashtable().size(), equalTo(0));
      request.addKeyValue("Key", "Value");
      assertThat(request.getHashtable().size(), equalTo(1));
    }

    @Test public void generateUrl() {
// http://ubuntuforums.org/showthread.php?t=754365
      String myURL = "http://ubuntuforums.org/showthread.php?";
      BaseRequest request = new BaseRequest(myURL);
      request.addKeyValue("t", "754365");
      
//       assertEquals (request.generatedUrl, "http://ubuntuforums.org/showthread.php?t=754365");
      assertThat(request.generateUrl(), equalTo("http://ubuntuforums.org/showthread.php?t=754365&"));
    }
}