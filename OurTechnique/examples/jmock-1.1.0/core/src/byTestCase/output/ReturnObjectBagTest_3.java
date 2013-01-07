package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ReturnObjectBag;

public class ReturnObjectBagTest_3 extends TestCase {

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

    public void testReturnSucceeds() {
        bag.putObjectToReturn(KEY1, VALUE_ONE);
        bag.putObjectToReturn(KEY2, VALUE_TWO);
        assertEquals("Should be first result", VALUE_ONE, bag.getNextReturnObject(KEY1));
        assertEquals("Should be second result", VALUE_TWO, bag.getNextReturnObject(KEY2));
        bag.verify();
    }
}
