package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.core.Invocation;
import org.jmock.core.stub.ThrowStub;
import org.jmock.expectation.AssertMo;
import test.jmock.core.DummyThrowable;
import test.jmock.core.testsupport.MethodFactory;

public class ThrowStubTest_2 extends TestCase {

    static final Throwable THROWABLE = new DummyThrowable();

    static final Class[] EXCEPTION_TYPES = { DummyThrowable.class };

    MethodFactory methodFactory;

    Invocation invocation;

    ThrowStub throwStub;

    public void setUp() {
        methodFactory = new MethodFactory();
        invocation = new Invocation("INVOKED-OBJECT", methodFactory.newMethod("methodName", MethodFactory.NO_ARGUMENTS, void.class, EXCEPTION_TYPES), null);
        throwStub = new ThrowStub(THROWABLE);
    }

    public void testIncludesDetailsOfThrowableInDescription() {
        StringBuffer buffer = new StringBuffer();
        throwStub.describeTo(buffer);
        String description = buffer.toString();
        assertTrue("contains class of thrown object in description", description.indexOf(THROWABLE.toString()) >= 0);
        assertTrue("contains 'throws' in description", description.indexOf("throws") >= 0);
    }

    public static class ExpectedExceptionType1 extends Exception {

        private static final long serialVersionUID = 1L;
    }

    public static class ExpectedExceptionType2 extends Exception {

        private static final long serialVersionUID = 1L;
    }
}
