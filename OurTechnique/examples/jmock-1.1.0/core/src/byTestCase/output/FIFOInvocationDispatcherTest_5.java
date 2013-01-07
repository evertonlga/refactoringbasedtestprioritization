package byTestCase.output;

import java.lang.reflect.Method;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.core.Invocation;
import org.jmock.core.FIFOInvocationDispatcher;
import org.jmock.util.Dummy;
import test.jmock.core.testsupport.MockInvokable;
import test.jmock.core.testsupport.MockStub;

public class FIFOInvocationDispatcherTest_5 extends TestCase {

    private Invocation invocation;

    private FIFOInvocationDispatcher dispatcher;

    private MockInvokable invokable1 = new MockInvokable();

    private MockInvokable invokable2 = new MockInvokable();

    public void setUp() throws NoSuchMethodException {
        invocation = new Invocation("INVOKED-OBJECT", getDummyMethod(), null);
        dispatcher = new FIFOInvocationDispatcher();
    }

    public void testByDefaultInvokeFailsWhenNoInvokablesMatch() throws Throwable {
        invokable1.matchesResult = false;
        invokable2.matchesResult = false;
        dispatcher.add(invokable1);
        dispatcher.add(invokable2);
        try {
            dispatcher.dispatch(invocation);
        } catch (AssertionFailedError ex) {
            return;
        }
        fail("expected AssertionFailedError");
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
