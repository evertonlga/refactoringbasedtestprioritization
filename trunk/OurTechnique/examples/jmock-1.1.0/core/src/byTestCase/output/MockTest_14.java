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

public class MockTest_14 extends TestCase {

    private MockDynamicMock mockCoreMock = new MockDynamicMock();

    private Mock mock = new Mock(mockCoreMock);

    static final String BUILDER_ID = "BUILDER-ID";

    public void testDuplicateUniqueIDCausesTestFailure() {
        MockMatchBuilder builder1 = new MockMatchBuilder();
        MockMatchBuilder builder2 = new MockMatchBuilder();
        mock.registerUniqueID(BUILDER_ID, builder1);
        try {
            mock.registerUniqueID(BUILDER_ID, builder2);
        } catch (AssertionFailedError ex) {
            AssertMo.assertIncludes("should contain invalid ID", BUILDER_ID, ex.getMessage());
            return;
        }
        fail("expected failure");
    }

    private interface MockedType {
    }
}
