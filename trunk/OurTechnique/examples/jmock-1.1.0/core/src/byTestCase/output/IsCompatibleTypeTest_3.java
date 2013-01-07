package byTestCase.output;

import org.jmock.core.constraint.IsCompatibleType;

public class IsCompatibleTypeTest_3 extends AbstractConstraintsTest {

    public void testMatchesExtendedClass() {
        assertMatches("should match", new IsCompatibleType(BaseClass.class), ExtendedClass.class);
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
