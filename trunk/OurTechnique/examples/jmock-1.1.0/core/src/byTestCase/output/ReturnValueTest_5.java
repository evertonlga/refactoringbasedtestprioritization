package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.ReturnValue;

public class ReturnValueTest_5 extends TestCase {

    private ReturnValue value;

    protected void setUp() throws Exception {
        super.setUp();
        value = new ReturnValue(getName());
    }

    public void testLongValue() {
        long now = System.currentTimeMillis();
        value.setValue(now);
        assertEquals(now, value.getLongValue());
        value.getIntValue();
    }
}
