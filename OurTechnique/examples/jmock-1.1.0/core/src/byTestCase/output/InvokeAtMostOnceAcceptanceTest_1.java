package byTestCase.output;

import org.jmock.Mock;
import org.jmock.MockObjectTestCase;
import org.jmock.core.DynamicMockError;

public class InvokeAtMostOnceAcceptanceTest_1 extends MockObjectTestCase {

    public void testPassesIfMethodExpectedAtMostOnceIsNotCalled() {
        Mock mock = mock(MockedType.class, "mock");
        mock.expects(atMostOnce()).method("m");
    }

    public interface MockedType {

        public void m();
    }
}
