package byTestCase.output;

import org.jmock.core.constraint.IsCompatibleType;

public class IsCompatibleTypeTest_8 extends AbstractConstraintsTest {

    public void testHasReadableDescription() {
        assertEquals("type < java.lang.Runnable", new IsCompatibleType(Runnable.class).describeTo(new StringBuffer()).toString());
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
