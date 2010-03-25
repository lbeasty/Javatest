package app;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.*;

public class BaseTransactionTest {

//   public	String		url;
//   public	URLConnection	connection = null;
// setConnection()
// writeToStream(String getStringToSend)
// readFromStream()


    @Test public void callConstructor() {
      String myURL = "http://www.google.ru";
      BaseTransaction trans = new BaseTransaction(myURL);
      assertThat(trans.url, equalTo(myURL));
    }

    @Test public void setConnectionToGoogle() {
      String myURL = "http://www.google.ru";
      BaseTransaction trans = new BaseTransaction(myURL);
      trans.setConnection();
      assertNotNull(trans.setConnection(trans.connection));
    }

    @Test public void writeToStreamConnection() {
// ???
      String myURL = "triton.towson.edu/~schmitt/server/servlet/www.informit.com/articles";
      BaseTransaction trans = new BaseTransaction(myURL);
      trans.setConnection();
      String stringToSend = "string=!!!";
      trans.writeToStream(stringToSend);
    }

    @Test public void readFromStreamConnection() {
// ???
      String myURL = "triton.towson.edu/~schmitt/server/servlet/www.informit.com/articles";
      BaseTransaction trans = new BaseTransaction(myURL);
      trans.setConnection();
      String stringToSend = "string=!!!";
      trans.writeToStream(stringToSend);
      stringToGet = trans.readFromStream();
      assertThat(stringToGet, equalTo(stringToSend));
    }


}