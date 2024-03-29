package core.tests;
/*  Copyright (c) 2000-2004 jMock.org
 */


import junit.framework.TestCase;
import org.jmock.core.Invocation;
import org.jmock.core.matcher.InvokedRecorder;
import org.jmock.expectation.AssertMo;
import test.jmock.core.testsupport.MethodFactory;


public class InvokedRecorderTest extends TestCase
{
    private Invocation emptyInvocation;
    InvokedRecorder recorder;

    public void setUp() {
        MethodFactory methodFactory = new MethodFactory();

        emptyInvocation = new Invocation("INVOKED-OBJECT",
                                         methodFactory.newMethod("example", MethodFactory.NO_ARGUMENTS, Void.class, MethodFactory.NO_EXCEPTIONS),
                                         new Object[0]);

        recorder = new InvokedRecorder();
    }

    public void testAlwaysMatches() {
        assertTrue("should match before invocation",
                   recorder.matches(emptyInvocation));

        recorder.invoked(emptyInvocation);

        assertTrue("should still match after invocation",
                   recorder.matches(emptyInvocation));
    }

    public void testAlwaysVerifies() {
        recorder.verify();
        recorder.invoked(emptyInvocation);
        recorder.verify();
    }

    public void testReportsIfHasBeenInvoked() {
        assertFalse("should not have been invoked", recorder.hasBeenInvoked());
        recorder.invoked(emptyInvocation);
        assertTrue("should have been invoked", recorder.hasBeenInvoked());
    }

    public void testCanExplicitlyVerifyThatItHasBeenInvoked() {
        AssertMo.assertFails("verifyHasBeenInvoked should fail", new Runnable() {
            public void run() {
                recorder.verifyHasBeenInvoked();
            }
        });
        recorder.invoked(emptyInvocation);
        recorder.verifyHasBeenInvoked();
    }

    public void testCanExplicitlyVerifyThatItHasBeenInvokedAnExactNumberOfTimes() {
        final int count = 4;

        for( int i = 0; i < count; i++ ) {
            AssertMo.assertFails("verifyHasBeenInvokedExactly should fail", new Runnable() {
                public void run() {
                    recorder.verifyHasBeenInvokedExactly(count);
                }
            });

            recorder.invoked(emptyInvocation);
        }

        recorder.verifyHasBeenInvoked();
    }

    public void testDoesNotWriteDescription() {
        assertEquals("should not be any description",
                     "", (recorder.describeTo(new StringBuffer())).toString());
    }
}
