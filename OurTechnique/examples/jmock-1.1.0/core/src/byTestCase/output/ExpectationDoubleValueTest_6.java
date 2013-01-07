package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationDoubleValue;

public class ExpectationDoubleValueTest_6 extends TestCase {

    private ExpectationDoubleValue myExpectation = new ExpectationDoubleValue("ExpectationDoubleValue for testing");

    public void testFailOutsideError() {
        myExpectation.setExpected(100.0, 1.0);
        try {
            myExpectation.setActual(102.0);
            fail("Should fail fast on double");
        } catch (AssertionFailedError ex) {
        }
    }
}
