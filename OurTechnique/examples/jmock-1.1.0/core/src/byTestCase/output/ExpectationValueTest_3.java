package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationValue;

public class ExpectationValueTest_3 extends TestCase {

    private ExpectationValue myExpectation = new ExpectationValue("ExpectationValue for testing");

    public void testExpectNothing() {
        myExpectation.setExpectNothing();
        assertTrue("Should have an expectation", myExpectation.hasExpectations());
    }
}
