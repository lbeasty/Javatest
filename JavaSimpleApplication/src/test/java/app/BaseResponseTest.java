package app;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.*;

public class BaseResponseTest {

    @Test public void callConstructor() {
      String resp = "LALALA";
      BaseResponse response = new BaseResponse(resp);
      assertThat(response.getResponse(), equalTo(resp));
    }

}