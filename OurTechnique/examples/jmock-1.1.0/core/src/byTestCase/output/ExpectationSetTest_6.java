package byTestCase.output;

import java.util.Vector;
import org.jmock.expectation.ExpectationSet;
import org.jmock.expectation.MapEntry;

public class ExpectationSetTest_6 extends AbstractTestExpectationCollection {

    protected void setUp() throws Exception {
        super.setUp();
        myExpectation = new ExpectationSet(getClass().getName());
    }

    public void testUnsortedSet() {
        myExpectation.addExpected("A");
        myExpectation.addExpected("B");
        myExpectation.addActual("A");
        myExpectation.addActual("B");
        myExpectation.addActual("A");
        myExpectation.addActual("B");
        myExpectation.verify();
    }
}
