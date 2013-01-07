package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.core.Invocation;
import org.jmock.core.stub.DefaultResultStub;
import org.jmock.expectation.AssertMo;
import test.jmock.core.testsupport.MethodFactory;

public class DefaultResultStubTest_7 extends TestCase {

    public DefaultResultStubTest_7(String name) {
        super(name);
    }

    static final Object[] NO_ARG_VALUES = new Object[0];

    private static MethodFactory METHOD_FACTORY = new MethodFactory();

    private DefaultResultStub stub;

    public void setUp() {
        stub = new DefaultResultStub();
    }

    public void testInvocationWithAnUnregisteredReturnTypeCausesAnAssertionFailedError() throws Throwable {
        Class unsupportedReturnType = UnsupportedReturnType.class;
        Class[] supportedReturnTypes = { boolean.class, byte.class, char.class, short.class, int.class, long.class, float.class, double.class, Boolean.class, Byte.class, Character.class, Short.class, Integer.class, Long.class, Float.class, Double.class, String.class };
        try {
            stub.invoke(invocationReturning(unsupportedReturnType));
        } catch (AssertionFailedError ex) {
            String message = ex.getMessage();
            AssertMo.assertIncludes("message should include name of unsupported type", unsupportedReturnType.getName(), message);
            for (int i = 0; i < supportedReturnTypes.length; i++) {
                AssertMo.assertIncludes("message should include names of expected types", supportedReturnTypes[i].getName(), message);
            }
            return;
        }
        fail("should have failed");
    }

    public void assertHasRegisteredValue(DefaultResultStub defaultResultStub, Class resultType, Object resultValue) throws Throwable {
        assertEquals("expected " + resultValue + " to be returned", resultValue, defaultResultStub.invoke(invocationReturning(resultType)));
    }

    public void assertHasNotRegisteredReturnType(DefaultResultStub defaultResultStub, Class resultType) throws Throwable {
        try {
            defaultResultStub.invoke(invocationReturning(resultType));
            fail("stub should not support return type " + resultType);
        } catch (AssertionFailedError expected) {
            return;
        }
    }

    private Invocation invocationReturning(Class resultType) {
        return new Invocation("INVOKED-OBJECT", METHOD_FACTORY.newMethodReturning(resultType), NO_ARG_VALUES);
    }

    public interface InterfaceType {

        int returnInt();
    }

    class UnsupportedReturnType {
    }
}
