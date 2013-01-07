package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationDoubleValue;

public class ExpectationDoubleValueTest_1 extends TestCase {

    private ExpectationDoubleValue myExpectation = new ExpectationDoubleValue("ExpectationDoubleValue for testing");

    public void testExpectNothing() {
        myExpectation.setExpectNothing();
        assertTrue("Should have an expectation", myExpectation.hasExpectations());
    }
}
