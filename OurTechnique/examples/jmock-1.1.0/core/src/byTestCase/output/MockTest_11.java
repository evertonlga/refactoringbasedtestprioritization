package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.Mock;
import org.jmock.core.InvocationMatcher;
import org.jmock.core.Invokable;
import org.jmock.expectation.AssertMo;
import test.jmock.builder.testsupport.MockMatchBuilder;
import test.jmock.core.DummyInterface;
import test.jmock.core.testsupport.MockDynamicMock;
import test.jmock.core.testsupport.MockInvocationMatcher;
import test.jmock.core.testsupport.MockInvokable;
import test.jmock.core.testsupport.MockStub;

public class MockTest_11 extends TestCase {

    private MockDynamicMock mockCoreMock = new MockDynamicMock();

    private Mock mock = new Mock(mockCoreMock);

    static final String BUILDER_ID = "BUILDER-ID";

    public void testFailsOnLookingUpUnregisteredID() {
        try {
            mock.lookupID(BUILDER_ID);
        } catch (AssertionFailedError ex) {
            assertTrue("error message should contain invalid id", ex.getMessage().indexOf(BUILDER_ID) >= 0);
            return;
        }
        fail("expected AssertionFailedError");
    }

    private interface MockedType {
    }
}
