package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationMap;

public class ExpectationMapTest_6 extends TestCase {

    public void testFailOnVerify() {
        ExpectationMap map = new ExpectationMap("map");
        map.setExpectNothing();
        map.setFailOnVerify();
        map.get("key");
        try {
            map.verify();
        } catch (AssertionFailedError ex) {
            return;
        }
        fail("should fail one entry");
    }
}
