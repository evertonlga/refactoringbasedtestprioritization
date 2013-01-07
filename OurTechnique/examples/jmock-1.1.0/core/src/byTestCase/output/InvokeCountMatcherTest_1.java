package byTestCase.output;

import junit.framework.TestCase;
import org.jmock.core.Invocation;
import org.jmock.core.matcher.InvokeCountMatcher;
import org.jmock.expectation.AssertMo;
import test.jmock.core.testsupport.MethodFactory;

public class InvokeCountMatcherTest_1 extends TestCase {

    private static final int COUNT = 3;

    private Invocation emptyInvocation;

    protected InvokeCountMatcher matcher;

    public void setUp() {
        MethodFactory methodFactory = new MethodFactory();
        emptyInvocation = new Invocation("INVOKED-OBJECT", methodFactory.newMethod("example", MethodFactory.NO_ARGUMENTS, Void.class, MethodFactory.NO_EXCEPTIONS), new Object[0]);
        matcher = new InvokeCountMatcher(COUNT);
    }

    public void testMatchesOnlyIfNotYetInvokedTheExpectedNumberOfTimes() {
        for (int i = 0; i < COUNT; i++) {
            assertTrue("Should match", matcher.matches(emptyInvocation));
            matcher.invoked(emptyInvocation);
        }
        assertFalse("Should not match", matcher.matches(emptyInvocation));
    }
}
