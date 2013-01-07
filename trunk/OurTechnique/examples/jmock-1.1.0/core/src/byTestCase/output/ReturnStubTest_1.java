package byTestCase.output;

import junit.framework.TestCase;
import org.jmock.core.Invocation;
import org.jmock.core.stub.ReturnStub;
import test.jmock.core.testsupport.MethodFactory;

public class ReturnStubTest_1 extends TestCase {

    static final String RESULT = "result";

    MethodFactory methodFactory;

    Object invokedObject;

    Class invokedObjectClass;

    Invocation invocation;

    ReturnStub returnStub;

    public void setUp() {
        methodFactory = new MethodFactory();
        invokedObject = "INVOKED-OBJECT";
        invokedObjectClass = Void.class;
        returnStub = new ReturnStub(RESULT);
    }

    public void testReturnsValuePassedToConstructor() throws Throwable {
        invocation = new Invocation(invokedObject, methodFactory.newMethodReturning(RESULT.getClass()), null);
        assertSame("Should be the same result object", RESULT, returnStub.invoke(invocation));
    }
}
