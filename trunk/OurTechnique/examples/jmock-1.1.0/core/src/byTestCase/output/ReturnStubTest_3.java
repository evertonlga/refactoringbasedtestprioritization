package byTestCase.output;

import junit.framework.TestCase;
import org.jmock.core.Invocation;
import org.jmock.core.stub.ReturnStub;
import test.jmock.core.testsupport.MethodFactory;

public class ReturnStubTest_3 extends TestCase {

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

    public void testCanReturnNullReference() throws Throwable {
        invocation = new Invocation(invokedObject, methodFactory.newMethodReturning(String.class), null);
        returnStub = new ReturnStub(null);
        assertNull("should return null", returnStub.invoke(invocation));
    }
}
