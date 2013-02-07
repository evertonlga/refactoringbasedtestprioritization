package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.core.Invocation;
import org.jmock.core.stub.TestFailureStub;
import test.jmock.core.testsupport.MethodFactory;

public class TestFailureStubTest_2 extends TestCase {

    static final String MESSAGE = "MESSAGE";

    Invocation invocation;

    TestFailureStub testFailureStub;

    public void setUp() {
        MethodFactory methodFactory = new MethodFactory();
        invocation = new Invocation("INVOKED-OBJECT", methodFactory.newMethodReturning(void.class), new Object[0]);
        testFailureStub = new TestFailureStub(MESSAGE);
    }

    public void testIncludesErrorMessageInDescription() {
        StringBuffer buffer = new StringBuffer();
        testFailureStub.describeTo(buffer);
        String description = buffer.toString();
        assertTrue("contains error message in description", description.indexOf(MESSAGE) >= 0);
    }
}