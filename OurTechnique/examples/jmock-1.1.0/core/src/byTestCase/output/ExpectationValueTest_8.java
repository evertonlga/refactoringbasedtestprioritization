package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationValue;

public class ExpectationValueTest_8 extends TestCase {

    private ExpectationValue myExpectation = new ExpectationValue("ExpectationValue for testing");

    public void testIntFail() {
        myExpectation.setExpected(100);
        boolean testPasses = false;
        try {
            myExpectation.setActual(150);
        } catch (AssertionFailedError ex) {
            testPasses = true;
        }
        assertTrue("Should fail fast on int", testPasses);
    }
}
