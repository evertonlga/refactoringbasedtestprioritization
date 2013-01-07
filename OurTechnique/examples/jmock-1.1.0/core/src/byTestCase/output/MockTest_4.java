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

public class MockTest_4 extends TestCase {

    private MockDynamicMock mockCoreMock = new MockDynamicMock();

    private Mock mock = new Mock(mockCoreMock);

    static final String BUILDER_ID = "BUILDER-ID";

    public void testDelegatesAddInvokableToCoreMock() {
        Invokable invokable = new MockInvokable();
        mockCoreMock.addInvokableCalls.setExpected(1);
        mockCoreMock.addInvokable.setExpected(invokable);
        mock.addInvokable(invokable);
        mockCoreMock.verifyExpectations();
    }

    private interface MockedType {
    }
}
