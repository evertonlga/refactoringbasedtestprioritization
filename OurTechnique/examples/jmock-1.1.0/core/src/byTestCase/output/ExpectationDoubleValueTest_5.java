package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationDoubleValue;

public class ExpectationDoubleValueTest_5 extends TestCase {

    private ExpectationDoubleValue myExpectation = new ExpectationDoubleValue("ExpectationDoubleValue for testing");

    public void testHasNoExpectations() {
        myExpectation.setActual(0.0);
        assertTrue("Has no expectations", !myExpectation.hasExpectations());
    }
}
