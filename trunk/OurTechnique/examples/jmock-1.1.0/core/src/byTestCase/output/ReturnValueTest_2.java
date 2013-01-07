package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.ReturnValue;

public class ReturnValueTest_2 extends TestCase {

    private ReturnValue value;

    protected void setUp() throws Exception {
        super.setUp();
        value = new ReturnValue(getName());
    }

    public void testGetValue() {
        value.setValue(this);
        assertEquals(this, value.getValue());
    }
}
