package app;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertFalse;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.*;

public class CityStateRequestTest {
//   public	String	city;
//   public	String	state;
//   public	String	url;
//   public CityStateRequest(String getURL, String getCityState)
//   public String validateCityState(String getCityState)

    @Test public void callConstructor() {
      String myURL = "http://www.google.ru";
      String cityState = "San Francisco,CA";
      CityStateRequest request = new CityStateRequest(myURL, cityState);
      assertThat(request.url, equalTo(myURL));
      assertThat(request.city, equalTo("San Francisco"));
      assertThat(request.state, equalTo("CA"));
    }

    @Test public void validateCityState() {
// ???
    }
}