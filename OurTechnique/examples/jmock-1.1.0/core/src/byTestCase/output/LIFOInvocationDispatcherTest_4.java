package byTestCase.output;

import java.lang.reflect.Method;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.core.Invocation;
import org.jmock.core.LIFOInvocationDispatcher;
import org.jmock.util.Dummy;
import test.jmock.core.testsupport.MockInvokable;
import test.jmock.core.testsupport.MockStub;

public class LIFOInvocationDispatcherTest_4 extends TestCase {

    private Invocation invocation;

    private LIFOInvocationDispatcher dispatcher;

    private MockInvokable invokable1 = new MockInvokable();

    private MockInvokable invokable2 = new MockInvokable();

    public void setUp() throws NoSuchMethodException {
        invocation = new Invocation("INVOKED-OBJECT", getDummyMethod(), null);
        dispatcher = new LIFOInvocationDispatcher();
    }

    public void testPropagatesExceptionFromInvokable() throws Throwable {
        Throwable exception = new Throwable("test throwable");
        invokable1.matchesResult = true;
        invokable1.invokeThrow = exception;
        dispatcher.add(invokable1);
        try {
            dispatcher.dispatch(invocation);
            fail("expected exception");
        } catch (Throwable t) {
            assertSame("should be same exception", exception, t);
        }
    }

    public void dummyMethod() {
    }

    private Method getDummyMethod() throws NoSuchMethodException {
        return getClass().getDeclaredMethod("dummyMethod", new Class[0]);
    }

    private void verifyInvokables() {
        invokable1.verifyExpectations();
        invokable2.verifyExpectations();
    }
}
