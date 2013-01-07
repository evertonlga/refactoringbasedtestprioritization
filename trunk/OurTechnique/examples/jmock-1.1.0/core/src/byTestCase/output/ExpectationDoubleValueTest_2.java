package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationDoubleValue;

public class ExpectationDoubleValueTest_2 extends TestCase {

    private ExpectationDoubleValue myExpectation = new ExpectationDoubleValue("ExpectationDoubleValue for testing");

    public void testExpectNothingFail() {
        myExpectation.setExpectNothing();
        try {
            myExpectation.setActual(100.0);
            fail("Should fail fast");
        } catch (AssertionFailedError ex) {
        }
    }
}
