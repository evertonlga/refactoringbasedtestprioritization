package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationCounter;

public class ExpectationCounterTest_1 extends TestCase {

    public void testExpectNothing() {
        ExpectationCounter e = new ExpectationCounter("");
        e.setExpectNothing();
        assertTrue("Has expectation", e.hasExpectations());
        e.verify();
    }
}
