package byTestCase.output;

import java.util.Vector;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;

public class AssertMoTest_4 extends TestCase {

    public void testAssertIncludesFails() {
        Throwable result = null;
        try {
            AssertMo.assertIncludes("Should fail if no include", "dog", "The quick brown fox");
        } catch (AssertionFailedError ex) {
            result = ex;
        }
        assertTrue("Should get an exception", result != null);
    }
}
