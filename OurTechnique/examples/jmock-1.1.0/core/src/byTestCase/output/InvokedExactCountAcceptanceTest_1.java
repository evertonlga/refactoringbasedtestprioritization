package byTestCase.output;

import junit.framework.AssertionFailedError;
import org.jmock.MockObjectTestCase;
import org.jmock.Mock;

public class InvokedExactCountAcceptanceTest_1 extends MockObjectTestCase {

    private final Mock mock = mock(MockedType.class, "mock");

    private final MockedType proxy = (MockedType) mock.proxy();

    protected void setUp() throws Exception {
        mock.expects(exactly(2)).method("m").withNoArguments();
    }

    public void testFailsWhenCalledFewerThanTheExactNumberOfTimes() {
        proxy.m();
        try {
            mock.verify();
        } catch (AssertionFailedError err) {
            mock.reset();
            return;
        }
        fail("Should have failed");
    }

    interface MockedType {

        void m();
    }
}
