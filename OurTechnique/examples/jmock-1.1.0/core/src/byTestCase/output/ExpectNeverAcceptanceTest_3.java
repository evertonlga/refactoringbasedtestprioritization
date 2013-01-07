package byTestCase.output;

import org.jmock.Mock;
import org.jmock.MockObjectTestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.core.DynamicMockError;

public class ExpectNeverAcceptanceTest_3 extends MockObjectTestCase {

    public void testExpectNeverCanExplicitlyDescribeError() {
        Mock mock = mock(MockedInterface.class, "mock");
        String errorMessage = "errorMessage";
        mock.expects(never(errorMessage)).method("method").withNoArguments();
        mock.expects(never(errorMessage)).method("method").withNoArguments();
        try {
            ((MockedInterface) mock.proxy()).method();
        } catch (DynamicMockError error) {
            AssertMo.assertIncludes("should contain explicit error message", errorMessage, error.getMessage());
            return;
        }
        fail("DynamicMockError expected");
    }

    private static interface MockedInterface {

        public void method();
    }
}
