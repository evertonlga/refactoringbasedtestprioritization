package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationCounter;

public class ExpectationCounterTest_8 extends TestCase {

    public void testSuccess() {
        ExpectationCounter e = new ExpectationCounter("");
        e.setExpected(1);
        e.inc();
        e.verify();
    }
}
