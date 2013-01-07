package byTestCase.output;

import java.util.Vector;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;

public class AssertMoTest_12 extends TestCase {

    public void testFailureCheckerWithFailure() {
        AssertMo.assertFails("Test Description", new Runnable() {

            public void run() {
                fail("Should not be propagated");
            }
        });
    }
}
