package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationSegment;

public class ExpectationSegmentTest_2 extends TestCase {

    private ExpectationSegment myExpectation;

    public void setUp() {
        myExpectation = new ExpectationSegment("Expectation segment");
    }

    public void testExpectNothingFail() {
        myExpectation.setExpectNothing();
        boolean hasThrownException = false;
        try {
            myExpectation.setActual("some string");
        } catch (AssertionFailedError ex) {
            hasThrownException = true;
        }
        assertTrue("Should fail fast", hasThrownException);
    }
}
