package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.core.Invocation;
import org.jmock.core.stub.DefaultResultStub;
import org.jmock.expectation.AssertMo;
import test.jmock.core.testsupport.MethodFactory;

public class DefaultResultStubTest_2 extends TestCase {

    public DefaultResultStubTest_2(String name) {
        super(name);
    }

    static final Object[] NO_ARG_VALUES = new Object[0];

    private static MethodFactory METHOD_FACTORY = new MethodFactory();

    private DefaultResultStub stub;

    public void setUp() {
        stub = new DefaultResultStub();
    }

    public void testReturnsUsefulDefaultResultsForBasicTypes() throws Throwable {
        assertHasRegisteredValue(stub, boolean.class, Boolean.FALSE);
        assertHasRegisteredValue(stub, void.class, null);
        assertHasRegisteredValue(stub, byte.class, new Byte((byte) 0));
        assertHasRegisteredValue(stub, short.class, new Short((short) 0));
        assertHasRegisteredValue(stub, int.class, new Integer(0));
        assertHasRegisteredValue(stub, long.class, new Long(0L));
        assertHasRegisteredValue(stub, char.class, new Character('\0'));
        assertHasRegisteredValue(stub, float.class, new Float(0.0F));
        assertHasRegisteredValue(stub, double.class, new Double(0.0));
        assertHasRegisteredValue(stub, Boolean.class, Boolean.FALSE);
        assertHasRegisteredValue(stub, Byte.class, new Byte((byte) 0));
        assertHasRegisteredValue(stub, Short.class, new Short((short) 0));
        assertHasRegisteredValue(stub, Integer.class, new Integer(0));
        assertHasRegisteredValue(stub, Long.class, new Long(0L));
        assertHasRegisteredValue(stub, Character.class, new Character('\0'));
        assertHasRegisteredValue(stub, Float.class, new Float(0.0F));
        assertHasRegisteredValue(stub, Double.class, new Double(0.0));
        assertHasRegisteredValue(stub, String.class, "");
        assertNotNull("should return an object for Object return type", stub.invoke(invocationReturning(Object.class)));
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
