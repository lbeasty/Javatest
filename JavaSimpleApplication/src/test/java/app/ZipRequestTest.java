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

public class ZipRequestTest {
//   public	String	zipcode;
//   public	String	url;
//   public ZipRequest(String getURL, String getZipcode)
//   public String validateZip(String getZipcode)

    @Test public void callConstructor() {
      String myURL = "http://www.google.ru";
      String zipcode = "ZIPCODE";
      ZipRequest request = new ZipRequest(myURL, zipcode);
      assertThat(request.url, equalTo(myURL));
      assertThat(request.zipcode, equalTo(zipcode));
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
