package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ReturnObjectList;

public class ReturnObjectListTest_3 extends TestCase {

    private ReturnObjectList list = new ReturnObjectList("test");

    public void testReturnSucceeds() {
        list.addObjectToReturn("one");
        list.addObjectToReturn("two");
        assertEquals("Should be first result", "one", list.nextReturnObject());
        assertEquals("Should be second result", "two", list.nextReturnObject());
        list.verify();
    }
}
