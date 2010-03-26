package app;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertFalse;

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



public class JavaSimpleApplicationTest extends TestCase
{
    /**
     * @param testName
     */
    public JavaSimpleApplicationTest( String testName )
    {
        super( testName );
    }


    public void testJavaSimpleApplication()
                        {
                        JavaSimpleApplication nops = new JavaSimpleApplication();
//                         assertTrue( nops.size() == 1);
//                         assertTrue(nops.getOp(0).getDesc().equals("plus"));
//                         assertTrue( nops.getOp(0).op(2,1) == 3);
                    
                        }
}
