package app;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class JavaSimpleApplicationTest extends TestCase
{
    /**
     * @param testName
     */
    public JavaSimpleApplicationTest( String testName )
    {
        super( testName );
    }

    ...

    public void testJavaSimpleApplication()
                        {
                        JavaSimpleApplication nops = new JavaSimpleApplication();
                        assertTrue( nops.size() == 1);
                        assertTrue(nops.getOp(0).getDesc().equals("plus"));
                        assertTrue( nops.getOp(0).op(2,1) == 3);
                    
                        }
}
