package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ReturnObjectList;

public class ReturnObjectListTest_4 extends TestCase {

    private ReturnObjectList list = new ReturnObjectList("test");

    public void testTooManyReturns() {
        try {
            list.nextReturnObject();
            fail("Error should have been raised");
        } catch (AssertionFailedError expected) {
        }
    }
}
