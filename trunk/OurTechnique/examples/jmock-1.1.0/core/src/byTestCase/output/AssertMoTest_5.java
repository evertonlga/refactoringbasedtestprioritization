package byTestCase.output;

import java.util.Vector;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;

public class AssertMoTest_5 extends TestCase {

    public void testAssertStartsWith() {
        AssertMo.assertStartsWith("Should start with fox", "fox", "fox quick brown");
    }
}
