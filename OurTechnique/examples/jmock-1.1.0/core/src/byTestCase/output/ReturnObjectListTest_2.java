package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ReturnObjectList;

public class ReturnObjectListTest_2 extends TestCase {

    private ReturnObjectList list = new ReturnObjectList("test");

    public void testEmptyList() {
        list.verify();
    }
}
