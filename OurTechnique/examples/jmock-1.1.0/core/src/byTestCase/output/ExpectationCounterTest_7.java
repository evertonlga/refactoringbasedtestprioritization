package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationCounter;

public class ExpectationCounterTest_7 extends TestCase {

    public void testHasNoExpectations() {
        ExpectationCounter aCounter = new ExpectationCounter("a test counter");
        aCounter.inc();
        assertTrue("Has no expectations", !aCounter.hasExpectations());
    }
}
