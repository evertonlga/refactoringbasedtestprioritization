package byTestCase.output;

import org.jmock.Mock;
import org.jmock.MockObjectTestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.core.DynamicMockError;

public class ExpectNeverAcceptanceTest_2 extends MockObjectTestCase {

    public void testExpectNeverVerifiesIfNotCalled() {
        Mock mock = mock(MockedInterface.class, "mock");
        mock.stubs().method("method").withNoArguments().isVoid();
        mock.expects(never()).method("method").withNoArguments();
    }

    private static interface MockedInterface {

        public void method();
    }
}
