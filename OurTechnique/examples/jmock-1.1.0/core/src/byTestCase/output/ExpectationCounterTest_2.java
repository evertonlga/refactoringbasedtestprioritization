package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationCounter;

public class ExpectationCounterTest_2 extends TestCase {

    public void testExpectNothingFailure() {
        ExpectationCounter e = new ExpectationCounter("");
        e.setExpectNothing();
        assertTrue("Has expectation", e.hasExpectations());
        try {
            e.inc();
        } catch (AssertionFailedError ex) {
            return;
        }
        fail("Should have failed immediately");
    }
}
