package byTestCase.output;

import junit.framework.AssertionFailedError;
import org.jmock.Mock;
import org.jmock.MockObjectTestCase;
import org.jmock.core.DynamicMockError;
import org.jmock.expectation.AssertMo;

public class OrderedInvocationsAcceptanceTest_7 extends MockObjectTestCase {

    private Mock mock;

    private ExampleInterface proxy;

    public void setUp() {
        mock = mock(ExampleInterface.class, "mock");
        proxy = (ExampleInterface) mock.proxy();
    }

    public void testCanSpecifyOrderOverDifferentMocks() {
        Mock otherMock = mock(ExampleInterface.class, "otherMock");
        ExampleInterface otherProxy = (ExampleInterface) otherMock.proxy();
        otherMock.stubs().method("hello").isVoid();
        mock.stubs().method("goodbye").after(otherMock, "hello");
        otherProxy.hello();
        proxy.goodbye();
    }

    public static interface ExampleInterface {

        void hello();

        void goodbye();

        void moreTeaVicar();

        int count();
    }
}
