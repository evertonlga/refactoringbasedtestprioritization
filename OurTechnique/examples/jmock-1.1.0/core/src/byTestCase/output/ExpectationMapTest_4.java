package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationMap;

public class ExpectationMapTest_4 extends TestCase {

    public void testExpectTwoEntries() {
        ExpectationMap map = new ExpectationMap("map");
        map.addExpected("key", "value");
        map.addExpected("key1", "value1");
        assertEquals("two entries", "value", map.get("key"));
        assertEquals("two entries", "value1", map.get("key1"));
        map.verify();
    }
}
