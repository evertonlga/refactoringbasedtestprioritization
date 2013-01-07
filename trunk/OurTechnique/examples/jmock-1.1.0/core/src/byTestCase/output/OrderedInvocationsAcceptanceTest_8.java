package byTestCase.output;

import junit.framework.AssertionFailedError;
import org.jmock.Mock;
import org.jmock.MockObjectTestCase;
import org.jmock.core.DynamicMockError;
import org.jmock.expectation.AssertMo;

public class OrderedInvocationsAcceptanceTest_8 extends MockObjectTestCase {

    private Mock mock;

    private ExampleInterface proxy;

    public void setUp() {
        mock = mock(ExampleInterface.class, "mock");
        proxy = (ExampleInterface) mock.proxy();
    }

    public void testDetectsUnexpectedOrderOverDifferentMocks() {
        String otherMockName = "otherMock";
        String priorCall = "HELLO-CALL-ID";
        Mock otherMock = mock(ExampleInterface.class, otherMockName);
        otherMock.stubs().method("hello").id(priorCall);
        mock.stubs().method("goodbye").after(otherMock, priorCall);
        try {
            proxy.goodbye();
            fail("expected DynamicMockError");
        } catch (DynamicMockError ex) {
            assertTrue("error message should contain id of prior call", ex.getMessage().indexOf(priorCall) >= 0);
            assertTrue("error message should contain name of mock receiving prior call", ex.getMessage().indexOf(otherMockName) >= 0);
        }
    }

    public static interface ExampleInterface {

        void hello();

        void goodbye();

        void moreTeaVicar();

        int count();
    }
}
