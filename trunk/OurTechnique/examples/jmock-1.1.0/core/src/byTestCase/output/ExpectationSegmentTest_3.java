package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationSegment;

public class ExpectationSegmentTest_3 extends TestCase {

    private ExpectationSegment myExpectation;

    public void setUp() {
        myExpectation = new ExpectationSegment("Expectation segment");
    }

    public void testFailOnVerify() {
        myExpectation.setExpected("a segment");
        myExpectation.setFailOnVerify();
        myExpectation.setActual("string without stuff");
        AssertMo.assertVerifyFails(myExpectation);
    }
}
