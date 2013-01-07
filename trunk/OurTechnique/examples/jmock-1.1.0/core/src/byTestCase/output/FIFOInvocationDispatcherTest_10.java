package byTestCase.output;

import java.lang.reflect.Method;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.core.Invocation;
import org.jmock.core.FIFOInvocationDispatcher;
import org.jmock.util.Dummy;
import test.jmock.core.testsupport.MockInvokable;
import test.jmock.core.testsupport.MockStub;

public class FIFOInvocationDispatcherTest_10 extends TestCase {

    private Invocation invocation;

    private FIFOInvocationDispatcher dispatcher;

    private MockInvokable invokable1 = new MockInvokable();

    private MockInvokable invokable2 = new MockInvokable();

    public void setUp() throws NoSuchMethodException {
        invocation = new Invocation("INVOKED-OBJECT", getDummyMethod(), null);
        dispatcher = new FIFOInvocationDispatcher();
    }

    public void testInvokesDefaultStubWhenNoInvokablesMatch() throws Throwable {
        MockStub mockDefaultStub = new MockStub("mockDefaultStub");
        Object defaultStubResult = Dummy.newDummy("DEFAULT STUB RESULT");
        dispatcher.add(invokable1);
        dispatcher.add(invokable2);
        invokable1.matchesResult = false;
        invokable2.matchesResult = false;
        mockDefaultStub.invokeInvocation.setExpected(invocation);
        mockDefaultStub.invokeResult = defaultStubResult;
        dispatcher.setDefaultStub(mockDefaultStub);
        assertSame("should be result of calling default stub", defaultStubResult, dispatcher.dispatch(invocation));
        verifyInvokables();
        mockDefaultStub.verify();
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
