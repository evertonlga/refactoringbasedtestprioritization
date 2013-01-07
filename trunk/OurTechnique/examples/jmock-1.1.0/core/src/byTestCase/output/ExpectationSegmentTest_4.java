package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationSegment;

public class ExpectationSegmentTest_4 extends TestCase {

    private ExpectationSegment myExpectation;

    public void setUp() {
        myExpectation = new ExpectationSegment("Expectation segment");
    }

    public void testFailsImmediately() {
        boolean hasThrownException = false;
        myExpectation.setExpected("inner");
        try {
            myExpectation.setActual("String not containing segment");
        } catch (AssertionFailedError expected) {
            hasThrownException = true;
        }
        assertTrue("Should have thrown exception", hasThrownException);
    }
}
