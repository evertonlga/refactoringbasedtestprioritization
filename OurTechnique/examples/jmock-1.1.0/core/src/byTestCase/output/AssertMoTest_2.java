package byTestCase.output;

import java.util.Vector;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;

public class AssertMoTest_2 extends TestCase {

    public void testAssertExcludesFails() {
        Throwable result = null;
        try {
            AssertMo.assertExcludes("Should fail on exclude", "fox", "The quick brown fox");
        } catch (AssertionFailedError ex) {
            result = ex;
        }
        assertTrue("Should get an exception", result != null);
    }
}
