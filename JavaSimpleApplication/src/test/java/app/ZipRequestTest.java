package app;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.*;

public class ZipRequestTest {
//   public	String	zipcode;
//   public	String	url;
//   public ZipRequest(String getURL, String getZipcode)
//   public String validateZip(String getZipcode)

    @Test public void callConstructor() {
      String myURL = "http://www.google.ru";
      String zipcode = "ZIPCODE";
      ZipRequest request = new ZipRequest(myURL, zipcode);
      assertThat(request.getUrl(), equalTo(myURL));
      assertThat(request.getZipcode(), equalTo(zipcode));
    }

    @Test public void validateZip() {
      String myURL = "http://www.google.ru";
      String zipcode = "ZIPCODE";
      String zipcodeIdeal = "ZIPCODE";
      ZipRequest request = new ZipRequest(myURL, zipcode);
      String getZipcode = request.validateZip(zipcode);
      assertThat(getZipcode, equalTo(zipcodeIdeal));
    }

}
