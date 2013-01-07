package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ReturnObjectBag;

public class ReturnObjectBagTest_7 extends TestCase {

    private ReturnObjectBag bag;

    private static final String KEY1 = "key1";

    private static final String KEY2 = "key2";

    private static final short SHORT_KEY1 = 1;

    private static final short SHORT_KEY2 = 2;

    private static final String VALUE_ONE = "one";

    private static final String VALUE_TWO = "two";

    protected void setUp() throws Exception {
        super.setUp();
        bag = new ReturnObjectBag(getName());
    }

    public void testNoListForKey() {
        try {
            bag.getNextReturnObject(KEY1);
            fail("AssertionFiledError not thrown");
        } catch (AssertionFailedError e) {
            assertEquals(getName() + " does not contain key1", e.getMessage());
        }
    }
}
