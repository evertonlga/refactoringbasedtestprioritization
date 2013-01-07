package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.core.Invocation;
import org.jmock.core.stub.ThrowStub;
import org.jmock.expectation.AssertMo;
import test.jmock.core.DummyThrowable;
import test.jmock.core.testsupport.MethodFactory;

public class ThrowStubTest_6 extends TestCase {

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

    public void testDoesNotCheckTypeCompatiblityOfErrors() throws Throwable {
        throwStub = new ThrowStub(new Error());
        try {
            throwStub.invoke(invocation);
        } catch (AssertionFailedError err) {
            throw err;
        } catch (Error ex) {
            return;
        }
        fail("should have thrown an Error");
    }

    public static class ExpectedExceptionType1 extends Exception {

        private static final long serialVersionUID = 1L;
    }

    public static class ExpectedExceptionType2 extends Exception {

        private static final long serialVersionUID = 1L;
    }
}
