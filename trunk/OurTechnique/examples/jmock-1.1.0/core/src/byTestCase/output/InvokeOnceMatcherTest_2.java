package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.core.Invocation;
import org.jmock.core.matcher.InvokeOnceMatcher;
import org.jmock.expectation.AssertMo;
import test.jmock.core.testsupport.MethodFactory;

public class InvokeOnceMatcherTest_2 extends TestCase {

    private Invocation emptyInvocation;

    private InvokeOnceMatcher matcher;

    private static final String MATCH_DESCRIPTION = "expected once";

    public void setUp() {
        MethodFactory methodFactory = new MethodFactory();
        emptyInvocation = new Invocation("INVOKED-OBJECT", methodFactory.newMethod("example", MethodFactory.NO_ARGUMENTS, Void.class, MethodFactory.NO_EXCEPTIONS), new Object[0]);
        matcher = new InvokeOnceMatcher();
    }

    public void testVerifyFailsIfNotYetInvoked() {
        try {
            matcher.verify();
        } catch (AssertionFailedError ex) {
            AssertMo.assertIncludes("should report expected method not invoked", "expected method was not invoked", ex.getMessage());
            return;
        }
        fail("Should have thrown exception");
    }
}
