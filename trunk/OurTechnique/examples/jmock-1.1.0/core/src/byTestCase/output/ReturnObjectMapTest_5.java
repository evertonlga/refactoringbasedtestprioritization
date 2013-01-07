package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ReturnObjectMap;

public class ReturnObjectMapTest_5 extends TestCase {

    private ReturnObjectMap map;

    private static final String KEY1 = "key1";

    private static final String KEY2 = "key2";

    private static final short SHORT_KEY1 = 1;

    private static final short SHORT_KEY2 = 2;

    private static final String VALUE_ONE = "one";

    private static final String VALUE_TWO = "two";

    protected void setUp() throws Exception {
        super.setUp();
        map = new ReturnObjectMap(getName());
    }

    public void testReturnBoolean() {
        map.putReturnValue(KEY1, true);
        assertEquals("Should be true", true, map.getBooleanValue(KEY1));
        map.verify();
    }
}
