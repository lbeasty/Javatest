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


    public void testJavaSimpleApplication()
                        {
                        JavaSimpleApplication nops = new JavaSimpleApplication();
//                         assertTrue( nops.size() == 1);
//                         assertTrue(nops.getOp(0).getDesc().equals("plus"));
//                         assertTrue( nops.getOp(0).op(2,1) == 3);
                    
                        }
}
/*

public class MathFunc {
    private int variable;

    public MathFunc() {
        variable = 0;
    }
    public MathFunc(int var) {
        variable = var;
    }

    public int getVariable() {
        return variable;
    }
    public void setVariable(int variable) {
        this.variable = variable;
    }

    public long factorial() {
        long result = 1;
        if (variable > 1) {
            for (int i=1; i<=variable; i++)
                result = result*i;
        }
        return result;
    }

    public long plus(int var) {
        long result = variable + var;
        return result;
    }
}


public class TestClass extends TestCase {
    public TestClass(String testName) {
        super(testName);
    }

    public void testFactorialNull() {
        MathFunc math = new MathFunc();
        assertTrue(math.factorial() == 1);
    }

    public void testFactorialPositive() {
        MathFunc math = new MathFunc(5);
        assertTrue(math.factorial() == 120);
    }

    public void testPlus() {
        MathFunc math = new MathFunc(45);
        assertTrue(math.plus(123) == 168);
    }
}*/

