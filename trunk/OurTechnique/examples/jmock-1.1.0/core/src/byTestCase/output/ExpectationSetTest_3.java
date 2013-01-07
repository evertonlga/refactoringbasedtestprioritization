package byTestCase.output;

import java.util.Vector;
import org.jmock.expectation.ExpectationSet;
import org.jmock.expectation.MapEntry;

public class ExpectationSetTest_3 extends AbstractTestExpectationCollection {

    protected void setUp() throws Exception {
        super.setUp();
        myExpectation = new ExpectationSet(getClass().getName());
    }

    public void testChanginHashcodeImediateCheck() {
        final Vector value = new Vector();
        myExpectation.addExpected(new MapEntry("key", value));
        value.add(getName());
        myExpectation.addActual(new MapEntry("key", value));
        myExpectation.verify();
    }
}
