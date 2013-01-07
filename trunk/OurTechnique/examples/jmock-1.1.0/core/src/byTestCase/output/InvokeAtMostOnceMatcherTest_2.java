package byTestCase.output;

import junit.framework.TestCase;
import org.jmock.core.Invocation;
import org.jmock.core.matcher.InvokeAtMostOnceMatcher;
import test.jmock.core.testsupport.MethodFactory;

public class InvokeAtMostOnceMatcherTest_2 extends TestCase {

    private Invocation emptyInvocation;

    private InvokeAtMostOnceMatcher matcher;

    private static final String MATCH_DESCRIPTION = "expected at most once";

    public void setUp() {
        MethodFactory methodFactory = new MethodFactory();
        emptyInvocation = new Invocation("INVOKED-OBJECT", methodFactory.newMethod("example", MethodFactory.NO_ARGUMENTS, Void.class, MethodFactory.NO_EXCEPTIONS), new Object[0]);
        matcher = new InvokeAtMostOnceMatcher();
    }

    public void testVerifyPassesIfNotYetInvoked() {
        matcher.verify();
    }
}
