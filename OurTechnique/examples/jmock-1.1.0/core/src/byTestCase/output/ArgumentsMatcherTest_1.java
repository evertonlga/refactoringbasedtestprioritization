package byTestCase.output;

import junit.framework.TestCase;
import org.jmock.core.Constraint;
import org.jmock.core.Invocation;
import org.jmock.core.constraint.IsSame;
import org.jmock.core.constraint.IsAnything;
import org.jmock.core.constraint.IsNothing;
import org.jmock.core.matcher.ArgumentsMatcher;
import test.jmock.core.testsupport.MethodFactory;

public class ArgumentsMatcherTest_1 extends TestCase {

    private static final String INVOKED_OBJECT = "INVOKED-OBJECT";

    private static final String exampleArg1 = "arg1";

    private static final String exampleArg2 = "arg2";

    private Invocation emptyInvocation;

    private Invocation exampleInvocation;

    public void setUp() {
        MethodFactory methodFactory = new MethodFactory();
        emptyInvocation = new Invocation(INVOKED_OBJECT, methodFactory.newMethod("example", MethodFactory.NO_ARGUMENTS, Void.class, MethodFactory.NO_EXCEPTIONS), new Object[0]);
        exampleInvocation = new Invocation(INVOKED_OBJECT, methodFactory.newMethod("example", new Class[] { String.class, String.class }, Void.class, MethodFactory.NO_EXCEPTIONS), new Object[] { exampleArg1, exampleArg2 });
    }

    public void testMatchWhenNoArgumentsOrConstraints() throws Throwable {
        ArgumentsMatcher matcher = new ArgumentsMatcher(new Constraint[0]);
        assertTrue("No arguments", matcher.matches(emptyInvocation));
    }

    private Constraint same(Object arg) {
        return new IsSame(arg);
    }
}
