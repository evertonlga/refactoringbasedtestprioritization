package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.ReturnValue;

public class ReturnValueTest_6 extends TestCase {

    private ReturnValue value;

    protected void setUp() throws Exception {
        super.setUp();
        value = new ReturnValue(getName());
    }

    public void testValueNotSet() {
        try {
            value.getValue();
            fail("Error not thrown");
        } catch (AssertionFailedError e) {
            assertEquals("The return value \"" + getName() + "\" has not been set.", e.getMessage());
        }
    }
}
