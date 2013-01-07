package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationMap;

public class ExpectationMapTest_5 extends TestCase {

    public void testFailOneEntry() {
        try {
            ExpectationMap map = new ExpectationMap("map");
            map.setExpectNothing();
            map.get("key");
        } catch (AssertionFailedError ex) {
            return;
        }
        fail("should fail one entry");
    }
}
