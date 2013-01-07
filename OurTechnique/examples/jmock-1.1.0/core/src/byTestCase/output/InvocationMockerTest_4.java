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

public class InvocationMockerTest_4 extends TestCase {

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

    public void testMatchesInvocationBeforeCallingStub() throws Throwable {
        MockInvocationMatcher mockInvocationMatcher = new MockInvocationMatcher();
        invocationMocker.addMatcher(mockInvocationMatcher);
        mockInvocationMatcher.invokedInvocation.setExpected(exampleInvocation);
        invocationMocker.invoke(exampleInvocation);
        Verifier.verifyObject(mockInvocationMatcher);
    }
}
