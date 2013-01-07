package byTestCase.output;

import java.lang.reflect.Method;
import junit.framework.TestCase;
import org.jmock.core.Invocation;
import org.jmock.core.InvocationMatcher;
import org.jmock.core.InvocationMocker;
import org.jmock.core.matcher.StatelessInvocationMatcher;
import org.jmock.util.Verifier;
import test.jmock.core.MockDescriber;
import test.jmock.core.testsupport.MethodFactory;
import test.jmock.core.testsupport.MockInvocationMatcher;
import test.jmock.core.testsupport.MockStub;

public class InvocationMockerTest_8 extends TestCase {

    private InvocationMatcher matchAll = new StatelessInvocationMatcher() {

        public boolean matches(Invocation invocation) {
            return true;
        }

        public StringBuffer describeTo(StringBuffer buffer) {
            return buffer.append("match all");
        }
    };

    private InvocationMatcher matchNone = new StatelessInvocationMatcher() {

        public boolean matches(Invocation invocation) {
            return false;
        }

        public StringBuffer describeTo(StringBuffer buffer) {
            return buffer.append("match none");
        }
    };

    private static final String ARG2 = "arg2";

    private static final String ARG1 = "arg1";

    private Invocation exampleInvocation;

    private InvocationMocker invocationMocker;

    public void setUp() {
        MethodFactory methodFactory = new MethodFactory();
        Method method = methodFactory.newMethod("example", new Class[] { String.class, String.class }, Void.class, MethodFactory.NO_EXCEPTIONS);
        exampleInvocation = new Invocation(new Object(), method, new Object[] { ARG1, ARG2 });
        invocationMocker = new InvocationMocker();
    }

    public void testDelegatesRequestForDescriptionDescriberObject() {
        MockDescriber mockDescriber = new MockDescriber();
        MockInvocationMatcher mockMatcher1 = new MockInvocationMatcher();
        MockInvocationMatcher mockMatcher2 = new MockInvocationMatcher();
        MockStub mockStub = new MockStub();
        String invocationMockerName = "INVOCATION-MOCKER-NAME";
        StringBuffer buf = new StringBuffer();
        invocationMocker = new InvocationMocker(mockDescriber);
        invocationMocker.addMatcher(mockMatcher1);
        invocationMocker.addMatcher(mockMatcher2);
        invocationMocker.setStub(mockStub);
        invocationMocker.setName(invocationMockerName);
        mockDescriber.hasDescriptionCalls.setExpected(1);
        mockDescriber.hasDescriptionResult = true;
        mockDescriber.describeToBuf.setExpected(buf);
        mockDescriber.describeToMatchers.addActual(mockMatcher1);
        mockDescriber.describeToMatchers.addActual(mockMatcher2);
        mockDescriber.describeToStub.setExpected(mockStub);
        mockDescriber.describeToName.setExpected(invocationMockerName);
        assertTrue("should have description", invocationMocker.hasDescription());
        invocationMocker.describeTo(buf);
        mockDescriber.verify();
    }
}
