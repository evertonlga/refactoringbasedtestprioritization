package byTestCase.output;

import org.jmock.core.constraint.IsCompatibleType;

public class IsCompatibleTypeTest_7 extends AbstractConstraintsTest {

    public void testDoesNotMatchObjectsThatAreNotClasses() {
        assertDoesNotMatch("should not match", new IsCompatibleType(BaseClass.class), "a string");
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
