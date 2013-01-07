package byTestCase.output;

import java.lang.reflect.Method;

import org.jmock.core.FIFOInvocationDispatcher;
import org.jmock.core.Invocation;

import test.jmock.core.testsupport.MockInvokable;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

public class FIFOInvocationDispatcherTest_11 extends TestCase{
	 private Invocation invocation;
	 private FIFOInvocationDispatcher dispatcher;
	 private MockInvokable invokable1 = new MockInvokable();

	 
	public void setUp() throws NoSuchMethodException {
	        invocation = new Invocation("INVOKED-OBJECT", getDummyMethod(), null);
	        dispatcher = new FIFOInvocationDispatcher();
	    }
	 
	public void testInvokeFailsWhenEmpty() throws Throwable {
        try {
            dispatcher.dispatch(invocation);
        }
        catch (AssertionFailedError expected) {
            return;
        }
        fail("expected AssertionFailedError");
    }
	
	private Method getDummyMethod() throws NoSuchMethodException {
        return getClass().getDeclaredMethod("dummyMethod", new Class[0]);
    }
	
	public void dummyMethod() {
    }
}
