package byTestCase.output;

import org.jmock.core.constraint.IsCompatibleType;

public class IsCompatibleTypeTest_4 extends AbstractConstraintsTest {

    public void testMatchesClassImplementingInterface() {
        assertMatches("should match", new IsCompatibleType(BaseInterface.class), ClassImplementingBaseInterface.class);
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
