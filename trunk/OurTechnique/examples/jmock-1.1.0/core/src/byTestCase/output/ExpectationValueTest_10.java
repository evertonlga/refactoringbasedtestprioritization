package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationValue;

public class ExpectationValueTest_10 extends TestCase {

    private ExpectationValue myExpectation = new ExpectationValue("ExpectationValue for testing");

    public void testLongFail() {
        myExpectation.setExpected(100L);
        boolean testPasses = false;
        try {
            myExpectation.setActual(150L);
        } catch (AssertionFailedError ex) {
            testPasses = true;
        }
        assertTrue("Should fail fast on long", testPasses);
    }
}
