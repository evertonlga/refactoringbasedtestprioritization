package byTestCase.output;

import org.jmock.Mock;
import org.jmock.MockObjectTestCase;
import org.jmock.core.DynamicMockError;

public class InvokeAtMostOnceAcceptanceTest_3 extends MockObjectTestCase {

    public void testFailsIfMethodExpectedAtMostOnceIsCalledMoreThanOnce() {
        Mock mock = mock(MockedType.class, "mock");
        mock.expects(atMostOnce()).method("m");
        MockedType proxy = (MockedType) mock.proxy();
        proxy.m();
        try {
            proxy.m();
            fail("should have thrown DynamicMockError");
        } catch (DynamicMockError error) {
        }
    }

    public interface MockedType {

        public void m();
    }
}
