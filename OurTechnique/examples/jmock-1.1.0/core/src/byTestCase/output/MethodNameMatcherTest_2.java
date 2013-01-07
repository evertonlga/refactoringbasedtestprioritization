package byTestCase.output;

import junit.framework.TestCase;
import org.jmock.core.Invocation;
import org.jmock.core.matcher.MethodNameMatcher;
import test.jmock.core.testsupport.MethodFactory;
import test.jmock.core.testsupport.MockConstraint;

public class MethodNameMatcherTest_2 extends TestCase {

    private static final String METHOD_NAME = "methodName";

    private static final String OTHER_NAME = "otherName";

    private Invocation exampleInvocation;

    public void setUp() {
        MethodFactory methodFactory = new MethodFactory();
        exampleInvocation = new Invocation("INVOKED-OBJECT", methodFactory.newMethod(METHOD_NAME, new Class[] { String.class, String.class }, Void.class, MethodFactory.NO_EXCEPTIONS), new Object[] { "arg1", "arg2" });
    }

    public void testDoesNotMatchIfConstraintFails() {
        MockConstraint mockConstraint = new MockConstraint("name constraint", METHOD_NAME, false);
        MethodNameMatcher matcher = new MethodNameMatcher(mockConstraint);
        assertFalse("should not match", matcher.matches(exampleInvocation));
    }
}
