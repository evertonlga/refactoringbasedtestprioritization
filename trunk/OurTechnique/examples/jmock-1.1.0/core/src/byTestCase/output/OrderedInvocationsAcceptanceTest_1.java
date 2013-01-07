package byTestCase.output;

import junit.framework.AssertionFailedError;
import org.jmock.Mock;
import org.jmock.MockObjectTestCase;
import org.jmock.core.DynamicMockError;
import org.jmock.expectation.AssertMo;

public class OrderedInvocationsAcceptanceTest_1 extends MockObjectTestCase {

    private Mock mock;

    private ExampleInterface proxy;

    public void setUp() {
        mock = mock(ExampleInterface.class, "mock");
        proxy = (ExampleInterface) mock.proxy();
    }

    public void testOrderedCallsCanOccurInOrder() {
        mock.stubs().method("hello").id("hello call");
        mock.stubs().method("goodbye").after("hello call");
        proxy.hello();
        proxy.goodbye();
    }

    public static interface ExampleInterface {

        void hello();

        void goodbye();

        void moreTeaVicar();

        int count();
    }
}
