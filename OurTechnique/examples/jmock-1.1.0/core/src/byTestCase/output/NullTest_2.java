package byTestCase.output;

import junit.framework.TestCase;
import org.jmock.expectation.Null;

public class NullTest_2 extends TestCase {

    public void testDescription() {
        assertEquals("Description", "what it is", new Null("what it is").toString());
    }
}
