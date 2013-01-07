package byTestCase.output;

import junit.framework.TestCase;
import org.jmock.core.Invocation;
import org.jmock.core.matcher.InvokedRecorder;
import org.jmock.expectation.AssertMo;
import test.jmock.core.testsupport.MethodFactory;

public class InvokedRecorderTest_1 extends TestCase {

    private Invocation emptyInvocation;

    InvokedRecorder recorder;

    public void setUp() {
        MethodFactory methodFactory = new MethodFactory();
        emptyInvocation = new Invocation("INVOKED-OBJECT", methodFactory.newMethod("example", MethodFactory.NO_ARGUMENTS, Void.class, MethodFactory.NO_EXCEPTIONS), new Object[0]);
        recorder = new InvokedRecorder();
    }

    public void testAlwaysMatches() {
        assertTrue("should match before invocation", recorder.matches(emptyInvocation));
        recorder.invoked(emptyInvocation);
        assertTrue("should still match after invocation", recorder.matches(emptyInvocation));
    }
}
