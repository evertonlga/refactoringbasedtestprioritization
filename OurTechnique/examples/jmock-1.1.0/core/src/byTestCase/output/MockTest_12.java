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

public class MockTest_12 extends TestCase {

    private MockDynamicMock mockCoreMock = new MockDynamicMock();

    private Mock mock = new Mock(mockCoreMock);

    static final String BUILDER_ID = "BUILDER-ID";

    public void testMethodNamesCanBeUsedToNameBuildersInAdditionToUniqueID() {
        MockMatchBuilder builder1 = new MockMatchBuilder();
        MockMatchBuilder builder2 = new MockMatchBuilder();
        mock.registerMethodName(BUILDER_ID + 1, builder1);
        mock.registerMethodName(BUILDER_ID + 2, builder2);
        assertSame("should be builder1", builder1, mock.lookupID(BUILDER_ID + 1));
        assertSame("should be builder2", builder2, mock.lookupID(BUILDER_ID + 2));
    }

    private interface MockedType {
    }
}
