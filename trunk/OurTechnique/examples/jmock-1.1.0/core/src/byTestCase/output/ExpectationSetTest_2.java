package byTestCase.output;

import java.util.Vector;
import org.jmock.expectation.ExpectationSet;
import org.jmock.expectation.MapEntry;

public class ExpectationSetTest_2 extends AbstractTestExpectationCollection {

    protected void setUp() throws Exception {
        super.setUp();
        myExpectation = new ExpectationSet(getClass().getName());
    }

    public void testChangingHashcode() {
        final Vector value = new Vector();
        myExpectation.addExpected(new MapEntry("key", value));
        myExpectation.addActual(new MapEntry("key", value));
        value.add(getName());
        myExpectation.verify();
    }
}
