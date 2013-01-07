package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.core.Invocation;
import org.jmock.core.matcher.TestFailureMatcher;
import test.jmock.core.testsupport.MethodFactory;

public class TestFailureMatcherTest_2 extends TestCase {

    static final String MESSAGE = "MESSAGE";

    Invocation invocation;

    TestFailureMatcher testFailureMatcher;

    public void setUp() {
        MethodFactory methodFactory = new MethodFactory();
        invocation = new Invocation("INVOKED-OBJECT", methodFactory.newMethod("ignoredName", MethodFactory.NO_ARGUMENTS, void.class, MethodFactory.NO_EXCEPTIONS), new Object[0]);
        testFailureMatcher = new TestFailureMatcher(MESSAGE);
    }

    public void testAlwaysVerifies() throws Throwable {
        testFailureMatcher.verify();
        invokeMatcher();
        testFailureMatcher.verify();
    }

    private void invokeMatcher() {
        try {
            testFailureMatcher.invoked(invocation);
        } catch (AssertionFailedError ex) {
        }
    }
}
