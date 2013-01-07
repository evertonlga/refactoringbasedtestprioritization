package byTestCase.output;

import java.util.Vector;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;

public class AssertMoTest_6 extends TestCase {

    public void testAssertStartsWithFails() {
        Throwable result = null;
        try {
            AssertMo.assertStartsWith("Should fail if it doesn't start with fox", "fox", "The quick brown fox");
        } catch (AssertionFailedError ex) {
            result = ex;
        }
        assertTrue("Should get an exception", result != null);
    }
}
