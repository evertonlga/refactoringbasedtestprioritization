package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationDoubleValue;

public class ExpectationDoubleValueTest_3 extends TestCase {

    private ExpectationDoubleValue myExpectation = new ExpectationDoubleValue("ExpectationDoubleValue for testing");

    public void testFailOnVerify() {
        myExpectation.setExpected(0.0, 0.0);
        myExpectation.setFailOnVerify();
        myExpectation.setActual(1.0);
        AssertMo.assertVerifyFails(myExpectation);
    }
}
