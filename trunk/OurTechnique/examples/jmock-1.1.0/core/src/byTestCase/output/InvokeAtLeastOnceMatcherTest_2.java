package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.core.Invocation;
import org.jmock.core.matcher.InvokeAtLeastOnceMatcher;
import org.jmock.expectation.AssertMo;
import test.jmock.core.testsupport.MethodFactory;

public class InvokeAtLeastOnceMatcherTest_2 extends TestCase {

    private Invocation emptyInvocation;

    private InvokeAtLeastOnceMatcher matcher;

    private static final String MATCH_DESCRIPTION = "expected at least once";

    public void setUp() {
        MethodFactory methodFactory = new MethodFactory();
        emptyInvocation = new Invocation("INVOKED-OBJECT", methodFactory.newMethod("example", MethodFactory.NO_ARGUMENTS, Void.class, MethodFactory.NO_EXCEPTIONS), new Object[0]);
        matcher = new InvokeAtLeastOnceMatcher();
    }

    public void testVerifyFailsIfNotYetInvoked() {
        try {
            matcher.verify();
        } catch (AssertionFailedError ex) {
            AssertMo.assertIncludes("should report method not invoked", "expected method was not invoked", ex.getMessage());
            return;
        }
        fail("Should have thrown exception");
    }
}
