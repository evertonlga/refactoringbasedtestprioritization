package byTestCase.output;

import junit.framework.TestCase;
import org.jmock.core.Invocation;
import org.jmock.core.matcher.InvokedRecorder;
import org.jmock.expectation.AssertMo;
import test.jmock.core.testsupport.MethodFactory;

public class InvokedRecorderTest_5 extends TestCase {

    private Invocation emptyInvocation;

    InvokedRecorder recorder;

    public void setUp() {
        MethodFactory methodFactory = new MethodFactory();
        emptyInvocation = new Invocation("INVOKED-OBJECT", methodFactory.newMethod("example", MethodFactory.NO_ARGUMENTS, Void.class, MethodFactory.NO_EXCEPTIONS), new Object[0]);
        recorder = new InvokedRecorder();
    }

    public void testCanExplicitlyVerifyThatItHasBeenInvokedAnExactNumberOfTimes() {
        final int count = 4;
        for (int i = 0; i < count; i++) {
            AssertMo.assertFails("verifyHasBeenInvokedExactly should fail", new Runnable() {

                public void run() {
                    recorder.verifyHasBeenInvokedExactly(count);
                }
            });
            recorder.invoked(emptyInvocation);
        }
        recorder.verifyHasBeenInvoked();
    }
}
