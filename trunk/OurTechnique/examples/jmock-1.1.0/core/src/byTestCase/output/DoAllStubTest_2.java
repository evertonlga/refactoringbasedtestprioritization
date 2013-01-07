package byTestCase.output;

import junit.framework.TestCase;
import org.jmock.core.Invocation;
import org.jmock.core.stub.DoAllStub;
import test.jmock.core.testsupport.MethodFactory;
import test.jmock.core.testsupport.MockStub;

public class DoAllStubTest_2 extends TestCase {

    private Object invokedObject = new Object() {

        public String toString() {
            return "INVOKED_OBJECT";
        }
    };

    private MethodFactory methodFactory = new MethodFactory();

    private Invocation invocation = new Invocation(invokedObject, methodFactory.newMethodReturning(String.class), null);

    public void testReturnsResultOfLastStub() throws Throwable {
        MockStub[] stubs = new MockStub[4];
        for (int i = 0; i < stubs.length; i++) {
            stubs[i] = new MockStub("stubs[" + i + "]");
            stubs[i].invokeResult = "stubs[" + i + "].invokeResult";
        }
        DoAllStub doAllStub = new DoAllStub(stubs);
        Object expectedResult = stubs[stubs.length - 1].invokeResult;
        Object actualResult = doAllStub.invoke(invocation);
        assertEquals("result", expectedResult, actualResult);
    }
}
