package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationValue;

public class ExpectationValueTest_1 extends TestCase {

    private ExpectationValue myExpectation = new ExpectationValue("ExpectationValue for testing");

    public void testBooleanFail() {
        myExpectation.setExpected(true);
        boolean testPasses = false;
        try {
            myExpectation.setActual(false);
        } catch (AssertionFailedError ex) {
            testPasses = true;
        }
        assertTrue("Should fail fast on boolean", testPasses);
    }
}
