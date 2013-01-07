package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationCounter;

public class ExpectationCounterTest_4 extends TestCase {

    public void testFailOnVerify() {
        ExpectationCounter aCounter = new ExpectationCounter("a test counter");
        aCounter.setExpected(1);
        aCounter.setFailOnVerify();
        aCounter.inc();
        aCounter.inc();
        AssertMo.assertVerifyFails(aCounter);
    }
}
