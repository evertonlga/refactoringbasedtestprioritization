package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.core.Invocation;
import org.jmock.core.stub.StubSequence;
import org.jmock.expectation.AssertMo;
import test.jmock.core.testsupport.MethodFactory;
import test.jmock.core.testsupport.MockStub;

public class StubSequenceTest_2 extends TestCase {

    private Object invokedObject = new Object() {

        public String toString() {
            return "INVOKED_OBJECT";
        }
    };

    private MethodFactory methodFactory = new MethodFactory();

    private Invocation invocation = new Invocation(invokedObject, methodFactory.newMethodReturning(String.class), null);

    static final String RESULT1 = "RESULT1";

    static final String RESULT2 = "RESULT2";

    static final String RESULT3 = "RESULT3";

    public void testThrowsAssertionFailedErrorIfInvokedMoreTimesThanThereAreStubs() throws Throwable {
        MockStub[] stubs = new MockStub[] { new MockStub(), new MockStub() };
        StubSequence sequence = new StubSequence(stubs);
        for (int i = 0; i < stubs.length; i++) sequence.invoke(invocation);
        try {
            sequence.invoke(invocation);
        } catch (AssertionFailedError ex) {
            AssertMo.assertIncludes("should describe error", "no more stubs", ex.getMessage());
        }
    }

    private void reset(MockStub[] stubs) {
        for (int i = 0; i < stubs.length; i++) {
            stubs[i].invokeInvocation.setExpectNothing();
        }
    }
}
