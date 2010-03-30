package app;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.*;

// public class RegularExpressionTest {
//  private static String zipRegEx = "^\\d{5}([\\-]\\d{4})?$";
//  private static Pattern pattern;
//   
//  @BeforeClass
//  public static void setUpBeforeClass() throws Exception {
//   pattern = Pattern.compile(zipRegEx);
//  }
// 
//  @Test
//  public void verifyZipCodeNoMatch() throws Exception{		 
//   Matcher mtcher = this.pattern.matcher("2211");
//   boolean notValid = mtcher.matches();		
//   assertFalse("Pattern did validate zip code", notValid);
//  }
// }


// public class JavaSimpleApplicationTest extends TestCase
public class JavaSimpleApplicationTest
{
    @Test public void sendParserCityState() {
      String url = "https://services.macys.com:4443/store_locator?";
      String request = "San Francisco,CA";
      JavaSimpleApplication app = new JavaSimpleApplication();
      
      BaseTransaction obj = app.parseRequest(url, request);
      System.out.println(obj);
      String tmp = obj.getUrl();
//       Class cls = obj.class;
//       System.out.println(tmp);
      assertThat(tmp, equalTo("https://services.macys.com:4443/store_locator?state=CA&city=San Francisco&"));
    }


}
