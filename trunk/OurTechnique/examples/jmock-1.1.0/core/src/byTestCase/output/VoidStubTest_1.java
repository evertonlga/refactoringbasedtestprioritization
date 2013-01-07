package byTestCase.output;

import junit.framework.TestCase;
import org.jmock.core.Invocation;
import org.jmock.core.stub.VoidStub;
import test.jmock.core.testsupport.MethodFactory;

public class VoidStubTest_1 extends TestCase {

    Invocation invocation;

    VoidStub voidStub;

    public void setUp() {
        MethodFactory methodFactory = new MethodFactory();
        invocation = new Invocation("INVOKED-OBJECT", methodFactory.newMethodReturning(void.class), new Object[0]);
        voidStub = new VoidStub();
    }

    public void testReturnsNullWhenInvoked() throws Throwable {
        assertNull("Should return null", new VoidStub().invoke(invocation));
    }
}
