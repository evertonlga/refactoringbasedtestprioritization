package byTestCase.output;

import org.jmock.core.constraint.IsCompatibleType;

public class IsCompatibleTypeTest_6 extends AbstractConstraintsTest {

    public void testDoesNotMatchIncompatibleTypes() {
        assertDoesNotMatch("should not match base type", new IsCompatibleType(ExtendedClass.class), BaseClass.class);
        assertDoesNotMatch("should not match incompatible types", new IsCompatibleType(String.class), Integer.class);
    }

    public static class BaseClass {
    }

    public static class ExtendedClass extends BaseClass {
    }

    public interface BaseInterface {
    }

    public interface ExtendedInterface extends BaseInterface {
    }

    public static class ClassImplementingBaseInterface implements BaseInterface {
    }
}
