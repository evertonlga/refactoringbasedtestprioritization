package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationDoubleValue;

public class ExpectationDoubleValueTest_4 extends TestCase {

    private ExpectationDoubleValue myExpectation = new ExpectationDoubleValue("ExpectationDoubleValue for testing");

    public void testFlushActual() {
        myExpectation.setActual(10);
        myExpectation.setExpectNothing();
        myExpectation.verify();
    }
}
