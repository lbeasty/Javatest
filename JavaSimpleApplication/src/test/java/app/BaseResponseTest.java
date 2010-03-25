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

public class BaseResponseTest {
//   public	String	response;
//   public BaseResponse(String getResponse)

    @Test public void callConstructor() {
      String resp = "LALALA";
      BaseResponse response = new BaseResponse(resp);
      assertThat(response.response, equalTo(resp));
    }

}