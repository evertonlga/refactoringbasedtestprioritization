package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationValue;

public class ExpectationValueTest_14 extends TestCase {

    private ExpectationValue myExpectation = new ExpectationValue("ExpectationValue for testing");

    public void testNullFail() {
        myExpectation.setExpected(null);
        boolean testPasses = false;
        try {
            myExpectation.setActual("another object");
        } catch (AssertionFailedError ex) {
            testPasses = true;
        }
        assertTrue("Should fail fast on object", testPasses);
    }
}
