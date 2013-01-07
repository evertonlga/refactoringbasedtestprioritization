package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationSegment;

public class ExpectationSegmentTest_6 extends TestCase {

    private ExpectationSegment myExpectation;

    public void setUp() {
        myExpectation = new ExpectationSegment("Expectation segment");
    }

    public void testHasNoExpectations() {
        myExpectation.setActual("a string");
        assertTrue("Has no expectations", !myExpectation.hasExpectations());
    }
}
