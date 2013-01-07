package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationSegment;

public class ExpectationSegmentTest_5 extends TestCase {

    private ExpectationSegment myExpectation;

    public void setUp() {
        myExpectation = new ExpectationSegment("Expectation segment");
    }

    public void testFlushActual() {
        myExpectation.setActual("a string");
        myExpectation.setExpectNothing();
        myExpectation.verify();
    }
}
