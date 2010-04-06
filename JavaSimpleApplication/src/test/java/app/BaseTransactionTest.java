package app;

import static org.hamcrest.MatcherAssert.*;
// import org.junit.Assert.*;

import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.*;


public class BaseTransactionTest {

    @Test public void callConstructor() {
      String myURL = "http://www.google.ru";
      BaseTransaction trans = new BaseTransaction(myURL);
      assertThat(trans.getUrl(), equalTo(myURL));
    }

    @Test public void setConnectionToUrl() {
      String myURL = "http://www.google.ru";
      BaseTransaction trans = new BaseTransaction(myURL);
      trans.setConnection();
      assertThat(trans.getConnection(), notNullValue());
    }

//     @Test public void writeToStreamConnection() {
// // ???
//       String myURL = "triton.towson.edu/~schmitt/server/servlet/www.informit.com/articles";
//       BaseTransaction trans = new BaseTransaction(myURL);
//       trans.setConnection();
//       String stringToSend = "string=!!!";
//       trans.writeToStream(stringToSend);
//     }

    @Test public void readFromStreamConnection() {
      String myURL = "https://services.macys.com:4443/store_locator?zipcode=94538";
      BaseTransaction trans = new BaseTransaction(myURL);
      trans.setConnection();
      String stringToGet = trans.readFromStream();
      assertThat(stringToGet, notNullValue());
    }


}