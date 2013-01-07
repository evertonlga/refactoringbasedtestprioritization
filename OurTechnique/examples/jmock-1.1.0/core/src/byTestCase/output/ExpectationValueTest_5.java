package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationValue;

public class ExpectationValueTest_5 extends TestCase {

    private ExpectationValue myExpectation = new ExpectationValue("ExpectationValue for testing");

    public void testFailOnVerify() {
        myExpectation.setExpected("string object");
        myExpectation.setFailOnVerify();
        myExpectation.setActual("another object");
        AssertMo.assertVerifyFails(myExpectation);
    }
}
