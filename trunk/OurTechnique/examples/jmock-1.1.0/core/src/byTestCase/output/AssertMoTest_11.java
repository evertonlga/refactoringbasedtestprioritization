package byTestCase.output;

import java.util.Vector;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;

public class AssertMoTest_11 extends TestCase {

    public void testEqualEmptyArrays() {
        Object[] anExpectedArray = new Object[0];
        Object[] anActualArray = new Object[0];
        AssertMo.assertEquals("Should be expected value", anExpectedArray, anActualArray);
    }
}
