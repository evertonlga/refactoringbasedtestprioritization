package byTestCase.output;

import junit.framework.TestCase;
import org.jmock.core.Invocation;
import org.jmock.core.matcher.InvokedRecorder;
import org.jmock.expectation.AssertMo;
import test.jmock.core.testsupport.MethodFactory;

public class InvokedRecorderTest_3 extends TestCase {

    private Invocation emptyInvocation;

    InvokedRecorder recorder;

    public void setUp() {
        MethodFactory methodFactory = new MethodFactory();
        emptyInvocation = new Invocation("INVOKED-OBJECT", methodFactory.newMethod("example", MethodFactory.NO_ARGUMENTS, Void.class, MethodFactory.NO_EXCEPTIONS), new Object[0]);
        recorder = new InvokedRecorder();
    }

    public void testReportsIfHasBeenInvoked() {
        assertFalse("should not have been invoked", recorder.hasBeenInvoked());
        recorder.invoked(emptyInvocation);
        assertTrue("should have been invoked", recorder.hasBeenInvoked());
    }
}
