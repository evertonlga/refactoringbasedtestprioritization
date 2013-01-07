package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationValue;

public class ExpectationValueTest_12 extends TestCase {

    private ExpectationValue myExpectation = new ExpectationValue("ExpectationValue for testing");

    public void testDoubleFail() {
        myExpectation.setExpected(100.0);
        boolean testPasses = false;
        try {
            myExpectation.setActual(150.0);
        } catch (AssertionFailedError ex) {
            testPasses = true;
        }
        assertTrue("Should fail fast on double", testPasses);
    }
}
