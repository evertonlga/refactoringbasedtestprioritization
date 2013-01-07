package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.core.Invocation;
import org.jmock.core.matcher.InvokeOnceMatcher;
import org.jmock.expectation.AssertMo;
import test.jmock.core.testsupport.MethodFactory;

public class InvokeOnceMatcherTest_5 extends TestCase {

    private Invocation emptyInvocation;

    private InvokeOnceMatcher matcher;

    private static final String MATCH_DESCRIPTION = "expected once";

    public void setUp() {
        MethodFactory methodFactory = new MethodFactory();
        emptyInvocation = new Invocation("INVOKED-OBJECT", methodFactory.newMethod("example", MethodFactory.NO_ARGUMENTS, Void.class, MethodFactory.NO_EXCEPTIONS), new Object[0]);
        matcher = new InvokeOnceMatcher();
    }

    public void testWritesDescriptionOfMatch() {
        String description = matcher.describeTo(new StringBuffer()).toString();
        assertTrue("should have description", matcher.hasDescription());
        assertEquals("should describe match", MATCH_DESCRIPTION, description);
    }
}
