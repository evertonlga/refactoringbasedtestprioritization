package byTestCase.output;

import java.util.Vector;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;

public class AssertMoTest_1 extends TestCase {

    public void testAssertExcludes() {
        AssertMo.assertExcludes("Should not include substring", "dog", "The quick brown fox");
    }
}
