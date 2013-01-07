package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationMap;

public class ExpectationMapTest_7 extends TestCase {

    public void testOverwriteEntry() {
        ExpectationMap map = new ExpectationMap("map");
        map.addExpected("key", "value");
        map.addExpected("key", "value1");
        assertEquals("overwrite entry", "value1", map.get("key"));
        map.verify();
    }
}
