package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationMap;

public class ExpectationMapTest_1 extends TestCase {

    public void testExpectMissingEntry() {
        ExpectationMap map = new ExpectationMap("map");
        map.addExpectedMissing("key");
        assertEquals("one entry", null, map.get("key"));
        map.verify();
    }
}
