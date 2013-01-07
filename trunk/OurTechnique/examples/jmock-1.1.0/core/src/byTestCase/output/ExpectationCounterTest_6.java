package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationCounter;

public class ExpectationCounterTest_6 extends TestCase {

    public void testFlushActual() {
        ExpectationCounter e = new ExpectationCounter("");
        e.inc();
        e.setExpected(1);
        e.inc();
        e.verify();
    }
}
