package byTestCase.output;

import junit.framework.AssertionFailedError;
import org.jmock.Mock;
import org.jmock.MockObjectTestCase;
import org.jmock.core.DynamicMockError;
import org.jmock.expectation.AssertMo;

public class OrderedInvocationsAcceptanceTest_9 extends MockObjectTestCase {

    private Mock mock;

    private ExampleInterface proxy;

    public void setUp() {
        mock = mock(ExampleInterface.class, "mock");
        proxy = (ExampleInterface) mock.proxy();
    }

    public void testAllowsSameInvocationMultipleTimes() {
        mock.stubs().method("hello").id("hello #1");
        mock.stubs().method("hello").after("hello #1").id("hello #2");
        mock.stubs().method("hello").after("hello #2").id("hello #3");
        mock.stubs().method("goodbye").after("hello #3");
        proxy.hello();
        proxy.hello();
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
