package byTestCase.output;

import java.util.Vector;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;

public class AssertMoTest_3 extends TestCase {

    public void testAssertIncludes() {
        AssertMo.assertIncludes("Should include a substring", "fox", "The quick brown fox");
    }
}
