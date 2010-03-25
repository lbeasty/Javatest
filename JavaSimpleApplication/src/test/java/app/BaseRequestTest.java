package app;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

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


    @Test public void callConstructor() {
      String myURL = "http://www.google.ru";
      BaseRequest request = new BaseRequest(myURL);
      assertThat(request.url, equalTo(myURL));
    }

    @Test public void addKeyValue() {
      String myURL = "http://www.google.ru";
      BaseRequest request = new BaseRequest(myURL);
      assertEquals(0, request.hashtable.size());
      request.addKeyValue("Key", "Value");
      assertEquals(1, request.hashtable.size());
    }

    @Test public void generateUrl() {
// http://ubuntuforums.org/showthread.php?t=754365
      String myURL = "http://ubuntuforums.org/showthread.php";
      BaseRequest request = new BaseRequest(myURL);
      request.addKeyValue("t", "754365");
      request.generateUrl();
      assertThat(request.generatedUrl, equalTo("http://ubuntuforums.org/showthread.php?t=754365"));
    }
}