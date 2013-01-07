package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.core.Invocation;
import org.jmock.core.matcher.InvokeOnceMatcher;
import org.jmock.expectation.AssertMo;
import test.jmock.core.testsupport.MethodFactory;

public class InvokeOnceMatcherTest_6 extends TestCase {

    private Invocation emptyInvocation;

    private InvokeOnceMatcher matcher;

    private static final String MATCH_DESCRIPTION = "expected once";

    public void setUp() {
        MethodFactory methodFactory = new MethodFactory();
        emptyInvocation = new Invocation("INVOKED-OBJECT", methodFactory.newMethod("example", MethodFactory.NO_ARGUMENTS, Void.class, MethodFactory.NO_EXCEPTIONS), new Object[0]);
        matcher = new InvokeOnceMatcher();
    }

    public void testReportsWhetherCalledInDescription() {
        matcher.invoked(emptyInvocation);
        String description = matcher.describeTo(new StringBuffer()).toString();
        assertTrue("should have description", matcher.hasDescription());
        assertTrue("should describe match", description.indexOf(MATCH_DESCRIPTION) >= 0);
        assertTrue("should report has been called", description.indexOf("has been invoked") >= 0);
    }
}
