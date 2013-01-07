package byTestCase.output;

import java.lang.reflect.Method;
import java.util.Arrays;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.core.Invocation;
import org.jmock.expectation.AssertMo;
import test.jmock.core.testsupport.MethodFactory;

public class InvocationTest_9 extends TestCase {

    public InvocationTest_9(String name) {
        super(name);
    }

    final Object INVOKED = new Object() {

        public String toString() {
            return "INVOKED";
        }
    };

    final String METHOD_NAME = "methodName";

    final Class[] ARG_TYPES = new Class[] { int.class, boolean.class };

    final Class RETURN_TYPE = String.class;

    final Object[] ARG_VALUES = { new Integer(0), Boolean.TRUE };

    final Class[] EXCEPTION_TYPES = new Class[] { InterruptedException.class, SecurityException.class };

    MethodFactory methodFactory;

    Method method;

    public void setUp() throws Exception {
        methodFactory = new MethodFactory();
        method = methodFactory.newMethod(METHOD_NAME, ARG_TYPES, RETURN_TYPE, EXCEPTION_TYPES);
    }

    public void testMethodToStringWithObjectArg() throws Exception {
        final String argAsString = "TO_STRING_RESULT";
        Object arg = new Object() {

            public String toString() {
                return argAsString;
            }
        };
        Invocation invocation = new Invocation(INVOKED, methodFactory.newMethod(METHOD_NAME, new Class[] { String.class }, void.class, EXCEPTION_TYPES), new Object[] { arg });
        String result = invocation.toString();
        AssertMo.assertIncludes("Should contain invokedMethod name", METHOD_NAME, result);
        AssertMo.assertIncludes("Should contain firstArg", argAsString, result);
    }
}
