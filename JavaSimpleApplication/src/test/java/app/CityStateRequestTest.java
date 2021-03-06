package app;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.*;

public class CityStateRequestTest {
    @Test public void callConstructor() {
      String myURL = "http://www.google.ru";
      String cityState = "San Francisco,CA";
      CityStateRequest request = new CityStateRequest(myURL, cityState);
      assertThat(request.getUrl(), equalTo(myURL));
      assertThat(request.getCity(), equalTo("san francisco"));
      assertThat(request.getState(), equalTo("ca"));
    }

    @Test public void validateCityState() {
// ???
    }
}