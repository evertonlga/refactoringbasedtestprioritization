package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.core.Invocation;
import org.jmock.core.stub.DefaultResultStub;
import org.jmock.expectation.AssertMo;
import test.jmock.core.testsupport.MethodFactory;

public class DefaultResultStubTest_3 extends TestCase {

    public DefaultResultStubTest_3(String name) {
        super(name);
    }

    static final Object[] NO_ARG_VALUES = new Object[0];

    private static MethodFactory METHOD_FACTORY = new MethodFactory();

    private DefaultResultStub stub;

    public void setUp() {
        stub = new DefaultResultStub();
    }

    public void testReturnsEmptyArrayForAllArrayTypes() throws Throwable {
        int[] defaultArrayForPrimitiveType = (int[]) stub.invoke(invocationReturning(int[].class));
        assertEquals("should be empty array", 0, defaultArrayForPrimitiveType.length);
        Object[] defaultArrayForReferenceType = (Object[]) stub.invoke(invocationReturning(Object[].class));
        assertEquals("should be empty array", 0, defaultArrayForReferenceType.length);
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
