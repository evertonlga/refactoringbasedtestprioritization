package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationDoubleValue;

public class ExpectationDoubleValueTest_8 extends TestCase {

    private ExpectationDoubleValue myExpectation = new ExpectationDoubleValue("ExpectationDoubleValue for testing");

    public void testPassWithinError() {
        myExpectation.setExpected(100.0, 1.0);
        myExpectation.setActual(100);
        myExpectation.verify();
    }
}
