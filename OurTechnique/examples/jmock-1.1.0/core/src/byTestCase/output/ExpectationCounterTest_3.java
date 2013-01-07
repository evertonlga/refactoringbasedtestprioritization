package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationCounter;

public class ExpectationCounterTest_3 extends TestCase {

    public void testFailImmediately() {
        ExpectationCounter aCounter = new ExpectationCounter("a test counter");
        aCounter.setExpected(1);
        aCounter.inc();
        try {
            aCounter.inc();
        } catch (AssertionFailedError ex) {
            return;
        }
        fail("Should have failed immediately");
    }
}
