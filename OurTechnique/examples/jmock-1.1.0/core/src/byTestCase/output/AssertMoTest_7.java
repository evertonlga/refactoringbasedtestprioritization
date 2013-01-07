package byTestCase.output;

import java.util.Vector;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;

public class AssertMoTest_7 extends TestCase {

    public void testDifferentArrays() {
        Object[] anExpectedArray = new Object[] { "one", new Integer(2) };
        Object[] anActualArray = new Object[] { "two", new Integer(2) };
        boolean threwException = false;
        try {
            AssertMo.assertEquals("Should be expected value", anExpectedArray, anActualArray);
        } catch (AssertionFailedError ignoredException) {
            threwException = true;
        }
        assertTrue("should have thrown assertion failure", threwException);
    }
}
