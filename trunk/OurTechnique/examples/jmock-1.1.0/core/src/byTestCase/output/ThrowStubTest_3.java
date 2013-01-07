package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.core.Invocation;
import org.jmock.core.stub.ThrowStub;
import org.jmock.expectation.AssertMo;
import test.jmock.core.DummyThrowable;
import test.jmock.core.testsupport.MethodFactory;

public class ThrowStubTest_3 extends TestCase {

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

    public void testThrowsAssertionFailedErrorIfTriesToThrowIncompatibleCheckedException() throws Throwable {
        Class[] expectedExceptionTypes = { ExpectedExceptionType1.class, ExpectedExceptionType2.class };
        Invocation incompatibleInvocation = new Invocation("INVOKED-OBJECT", methodFactory.newMethod("methodName", MethodFactory.NO_ARGUMENTS, void.class, expectedExceptionTypes), null);
        try {
            throwStub.invoke(incompatibleInvocation);
        } catch (AssertionFailedError ex) {
            String message = ex.getMessage();
            for (int i = 0; i < expectedExceptionTypes.length; i++) {
                AssertMo.assertIncludes("should include name of expected exception types", expectedExceptionTypes[i].getName(), message);
            }
            AssertMo.assertIncludes("should include name of thrown exception type", THROWABLE.getClass().getName(), message);
            return;
        }
        fail("should have failed");
    }

    public static class ExpectedExceptionType1 extends Exception {

        private static final long serialVersionUID = 1L;
    }

    public static class ExpectedExceptionType2 extends Exception {

        private static final long serialVersionUID = 1L;
    }
}
