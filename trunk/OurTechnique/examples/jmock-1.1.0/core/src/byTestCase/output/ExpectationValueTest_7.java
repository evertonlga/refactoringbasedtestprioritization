package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationValue;

public class ExpectationValueTest_7 extends TestCase {

    private ExpectationValue myExpectation = new ExpectationValue("ExpectationValue for testing");

    public void testHasNoExpectations() {
        myExpectation.setActual("a value");
        assertTrue("Has no expectations", !myExpectation.hasExpectations());
    }
}
