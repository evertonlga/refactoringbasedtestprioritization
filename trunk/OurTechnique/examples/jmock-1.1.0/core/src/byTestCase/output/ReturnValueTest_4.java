package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.ReturnValue;

public class ReturnValueTest_4 extends TestCase {

    private ReturnValue value;

    protected void setUp() throws Exception {
        super.setUp();
        value = new ReturnValue(getName());
    }

    public void testIntValue() {
        value.setValue(13);
        assertEquals(13, value.getIntValue());
    }
}
