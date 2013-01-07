package byTestCase.output;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import test.jmock.core.testsupport.MethodFactory;
import junit.framework.TestCase;

public class MethodFactoryTest_2 extends TestCase {

    static final String METHOD_NAME = "METHOD_NAME";

    static final Class[] ARG_TYPES = new Class[] { int.class, Object.class, double[].class, String[].class };

    static final Class RETURN_TYPE = ReturnType.class;

    static final Class[] EXCEPTION_TYPES = new Class[] { InterruptedException.class };

    MethodFactory factory;

    public void setUp() {
        factory = new MethodFactory();
    }

    public void testCreatesMethodThatReturnsAType() {
        Method method = factory.newMethodReturning(RETURN_TYPE);
        assertSame("return type", RETURN_TYPE, method.getReturnType());
    }

    private void assertAllSame(String message, Class[] expected, Class[] actual) {
        assertEquals(message + ": number of elements ", expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertSame(message + ": element " + i, expected[i], actual[i]);
        }
    }

    private class ReturnType {
    }
}
