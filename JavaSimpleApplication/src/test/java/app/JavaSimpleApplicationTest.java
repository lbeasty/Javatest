package app;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.*;

public class JavaSimpleApplicationTest
{
    @Test public void sendParserCityState() {
      String url = "https://services.macys.com:4443/store_locator?";
      String request = "San Francisco,CA";
      JavaSimpleApplication app = new JavaSimpleApplication();
      
      BaseTransaction obj = app.parseRequest(url, request);
      System.out.println(obj);
      String tmp = obj.getUrl();

      assertThat(tmp, equalTo("https://services.macys.com:4443/store_locator?state=ca&city=san francisco&"));
    }


}
