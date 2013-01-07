package byTestCase.output;

import java.util.Vector;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;

public class AssertMoTest_13 extends TestCase {

    public void testFailureCheckerWithoutFailure() {
        final String TEST_MESSAGE = "Test Description";
        try {
            AssertMo.assertFails(TEST_MESSAGE, new Runnable() {

                public void run() {
                }
            });
        } catch (AssertionFailedError expected) {
            assertEquals(TEST_MESSAGE, expected.getMessage());
            return;
        }
        fail("Should have thrown an exception");
    }
}
