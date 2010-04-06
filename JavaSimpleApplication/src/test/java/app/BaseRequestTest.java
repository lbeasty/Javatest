package app;
// import junit.framework.Test;
// import junit.framework.TestCase;
// import junit.framework.TestSuite;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.*;

public class BaseRequestTest {

    @Test public void callConstructor() {
      String myURL = "http://www.google.ru";
      BaseRequest request = new BaseRequest(myURL);
      String actual = request.getUrl();
      assertThat(actual, equalTo(myURL));
    }

    @Test public void addKeyValue() {
      String myURL = "http://www.google.ru";
      BaseRequest request = new BaseRequest(myURL);
      assertThat(request.getRequestParams().size(), equalTo(0));
      request.addKeyValue("Key", "Value");
      assertThat(request.getRequestParams().size(), equalTo(1));
    }

    @Test public void generateUrl() {
      String myURL = "http://ubuntuforums.org/showthread.php?";
      BaseRequest request = new BaseRequest(myURL);
      request.addKeyValue("t", "754365");
      assertThat(request.generateUrl(), equalTo("http://ubuntuforums.org/showthread.php?t=754365&"));
    }
}