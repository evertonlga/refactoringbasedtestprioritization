package byTestCase.output;

import java.lang.reflect.Method;
import java.util.Arrays;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.core.Invocation;
import org.jmock.expectation.AssertMo;
import test.jmock.core.testsupport.MethodFactory;

public class InvocationTest_3 extends TestCase {

    public InvocationTest_3(String name) {
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

    public void testTestsForEqualityOnTargetAndMethodSignatureAndArguments() {
        Invocation invocation1 = new Invocation(INVOKED, method, ARG_VALUES);
        Invocation invocation2 = new Invocation(INVOKED, method, ARG_VALUES);
        Invocation differentTarget = new Invocation("OTHER TARGET", method, ARG_VALUES);
        Invocation differentMethod = new Invocation(INVOKED, methodFactory.newMethod("OTHER_" + METHOD_NAME, ARG_TYPES, RETURN_TYPE, EXCEPTION_TYPES), ARG_VALUES);
        Invocation differentArgValues = new Invocation(INVOKED, method, new Object[] { new Integer(1), Boolean.FALSE });
        assertTrue("should be equal to itself", invocation1.equals(invocation1));
        assertTrue("identical calls should be equal", invocation1.equals(invocation2));
        assertFalse("should not be equal to object that is not an Invocation", invocation1.equals(new Object()));
        assertFalse("should not be equal to null", invocation1.equals(null));
        assertFalse("should not be equal if different invoked object", invocation1.equals(differentTarget));
        assertFalse("should not be equal if different method", invocation1.equals(differentMethod));
        assertFalse("should not be equal if different argumentValues", invocation1.equals(differentArgValues));
    }
}
