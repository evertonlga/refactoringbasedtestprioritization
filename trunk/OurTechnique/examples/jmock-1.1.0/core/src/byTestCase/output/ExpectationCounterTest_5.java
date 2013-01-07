package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationCounter;

public class ExpectationCounterTest_5 extends TestCase {

    public void testFailure() {
        ExpectationCounter e = new ExpectationCounter("");
        e.setExpected(1);
        AssertMo.assertVerifyFails(e);
    }
}
