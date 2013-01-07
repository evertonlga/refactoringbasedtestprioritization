package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.core.Invocation;
import org.jmock.core.matcher.InvokedAfterMatcher;
import org.jmock.core.matcher.InvokedRecorder;
import test.jmock.core.testsupport.MethodFactory;

public class InvokedAfterMatcherTest_1 extends TestCase {

    private static final String PRIOR_CALL_ID = "RECORDER-ID";

    private Invocation invocation1;

    private Invocation invocation2;

    private InvokedRecorder recorder;

    private InvokedAfterMatcher after;

    public void setUp() {
        MethodFactory methodFactory = new MethodFactory();
        invocation1 = new Invocation("INVOKED-OBJECT-1", methodFactory.newMethod("invocation1", MethodFactory.NO_ARGUMENTS, Void.class, MethodFactory.NO_EXCEPTIONS), new Object[0]);
        invocation2 = new Invocation("INVOKED-OBJECT-2", methodFactory.newMethod("invocation2", MethodFactory.NO_ARGUMENTS, Void.class, MethodFactory.NO_EXCEPTIONS), new Object[0]);
        recorder = new InvokedRecorder();
        after = new InvokedAfterMatcher(recorder, PRIOR_CALL_ID);
    }

    public void testOnlyMatchesWhenInvokedAfterPriorInvocation() {
        assertFalse("should not match before previous invocation", after.matches(invocation2));
        recorder.invoked(invocation1);
        assertTrue("should match after previous invocation", after.matches(invocation2));
    }
}
