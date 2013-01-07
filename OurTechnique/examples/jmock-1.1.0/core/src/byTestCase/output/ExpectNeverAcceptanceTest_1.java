package byTestCase.output;

import org.jmock.Mock;
import org.jmock.MockObjectTestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.core.DynamicMockError;

public class ExpectNeverAcceptanceTest_1 extends MockObjectTestCase {

    public void testExpectNeverOverridesStubAndFailsIfCalled() {
        Mock mock = mock(MockedInterface.class, "mock");
        mock.stubs().method("method").withNoArguments();
        mock.expects(never()).method("method").withNoArguments();
        try {
            ((MockedInterface) mock.proxy()).method();
        } catch (DynamicMockError error) {
            return;
        }
        fail("DynamicMockError expected");
    }

    private static interface MockedInterface {

        public void method();
    }
}
