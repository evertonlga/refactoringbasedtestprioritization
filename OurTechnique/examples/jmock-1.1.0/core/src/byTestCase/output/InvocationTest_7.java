package byTestCase.output;

import java.lang.reflect.Method;
import java.util.Arrays;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.core.Invocation;
import org.jmock.expectation.AssertMo;
import test.jmock.core.testsupport.MethodFactory;

public class InvocationTest_7 extends TestCase {

    public InvocationTest_7(String name) {
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

    public void testToStringWithPrimitiveArray() throws Exception {
        Invocation invocation = new Invocation(INVOKED, methodFactory.newMethod(METHOD_NAME, new Class[] { long[].class }, void.class, EXCEPTION_TYPES), new Object[] { new long[] { 1, 2 } });
        String result = invocation.toString();
        AssertMo.assertIncludes("Should contain invokedMethod name", METHOD_NAME, result);
        AssertMo.assertIncludes("Should contain args as an array", "[<1L>, <2L>]", result);
    }
}
