package byTestCase.output;

import org.jmock.Mock;
import org.jmock.MockObjectTestCase;
import org.jmock.core.DynamicMockError;

public class InvokeAtMostOnceAcceptanceTest_2 extends MockObjectTestCase {

    public void testPassesIfMethodExpectedAtMostOnceIsCalledOnceOnly() {
        Mock mock = mock(MockedType.class, "mock");
        mock.expects(atMostOnce()).method("m");
        MockedType proxy = (MockedType) mock.proxy();
        proxy.m();
    }

    public interface MockedType {

        public void m();
    }
}
