package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.ReturnValue;

public class ReturnValueTest_1 extends TestCase {

    private ReturnValue value;

    protected void setUp() throws Exception {
        super.setUp();
        value = new ReturnValue(getName());
    }

    public void testGetNull() {
        value.setValue(null);
        assertTrue(value.getValue() == null);
    }
}
