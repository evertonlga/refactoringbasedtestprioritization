package byTestCase.output;

import junit.framework.AssertionFailedError;
import org.jmock.Mock;
import org.jmock.MockObjectTestCase;
import org.jmock.core.DynamicMockError;
import org.jmock.expectation.AssertMo;

public class OrderedInvocationsAcceptanceTest_6 extends MockObjectTestCase {

    private Mock mock;

    private ExampleInterface proxy;

    public void setUp() {
        mock = mock(ExampleInterface.class, "mock");
        proxy = (ExampleInterface) mock.proxy();
    }

    public void testUsingSameMethodNameAsParameterToAfterIsAnError() {
        mock.stubs().method("count").will(returnValue(1));
        try {
            mock.stubs().method("count").after("count").will(returnValue(2));
        } catch (AssertionFailedError ex) {
            AssertMo.assertIncludes("should include repeated invokedMethod name", "count", ex.getMessage());
            return;
        }
        fail("should have failed");
    }

    public static interface ExampleInterface {

        void hello();

        void goodbye();

        void moreTeaVicar();

        int count();
    }
}
