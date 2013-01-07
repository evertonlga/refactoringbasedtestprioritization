package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationMap;

public class ExpectationMapTest_3 extends TestCase {

    public void testExpectOneEntry() {
        ExpectationMap map = new ExpectationMap("map");
        map.addExpected("key", "value");
        assertEquals("one entry", "value", map.get("key"));
        map.verify();
    }
}
