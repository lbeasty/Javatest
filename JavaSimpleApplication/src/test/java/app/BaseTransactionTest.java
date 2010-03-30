package app;

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
      assertThat(trans.getUrl(), equalTo(myURL));
    }

    @Test public void setConnectionToGoogle() {
      String myURL = "http://www.google.ru";
      BaseTransaction trans = new BaseTransaction(myURL);
      trans.setConnection();
      assertThat(trans.getConnection(), equalTo(null));
//       assertNotNull(trans.connection);
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
      String stringToGet = trans.readFromStream();
      assertThat(stringToGet, equalTo(stringToSend));
    }


}