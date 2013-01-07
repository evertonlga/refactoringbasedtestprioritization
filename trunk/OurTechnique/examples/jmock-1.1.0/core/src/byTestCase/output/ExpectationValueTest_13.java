package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationValue;

public class ExpectationValueTest_13 extends TestCase {

    private ExpectationValue myExpectation = new ExpectationValue("ExpectationValue for testing");

    public void testDoublePass() {
        myExpectation.setExpected(100.0);
        myExpectation.setActual(100.0);
        myExpectation.verify();
    }
}
