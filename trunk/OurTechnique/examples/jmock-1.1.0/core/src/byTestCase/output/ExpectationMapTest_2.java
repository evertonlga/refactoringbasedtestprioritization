package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationMap;

public class ExpectationMapTest_2 extends TestCase {

    public void testExpectNullEntry() {
        ExpectationMap map = new ExpectationMap("map");
        try {
            map.addExpected("key", null);
            assertEquals("one entry", null, map.get("key"));
            map.verify();
        } catch (NullPointerException ex) {
            AssertMo.assertStartsWith("Should be JDK 1.1.7A", "1.1", System.getProperty("java.version"));
        }
    }
}
