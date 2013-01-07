package byTestCase.output;

import java.util.Vector;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;

public class AssertMoTest_10 extends TestCase {

    public void testEqualArrays() {
        Object[] anExpectedArray = new Object[] { "one", new Integer(2) };
        Object[] anActualArray = new Object[] { "one", new Integer(2) };
        AssertMo.assertEquals("Should be expected value", anExpectedArray, anActualArray);
    }
}
