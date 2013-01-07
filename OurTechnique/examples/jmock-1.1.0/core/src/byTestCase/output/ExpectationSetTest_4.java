package byTestCase.output;

import java.util.Vector;
import org.jmock.expectation.ExpectationSet;
import org.jmock.expectation.MapEntry;

public class ExpectationSetTest_4 extends AbstractTestExpectationCollection {

    protected void setUp() throws Exception {
        super.setUp();
        myExpectation = new ExpectationSet(getClass().getName());
    }

    public void testMultiUnsortedSet() {
        myExpectation.addExpectedMany(new String[] { "A", "B" });
        myExpectation.addActualMany(new String[] { "A", "B", "A", "B" });
        myExpectation.verify();
    }
}
