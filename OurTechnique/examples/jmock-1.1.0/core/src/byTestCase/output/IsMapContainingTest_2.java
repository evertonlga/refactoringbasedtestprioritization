package byTestCase.output;

import java.util.HashMap;
import java.util.Map;
import org.jmock.core.Constraint;
import org.jmock.core.constraint.IsAnything;
import org.jmock.core.constraint.IsEqual;
import org.jmock.core.constraint.IsMapContaining;

public class IsMapContainingTest_2 extends AbstractConstraintsTest {

    private static final IsAnything ANYTHING = IsAnything.INSTANCE;

    public void testDoesNotMatchAnObjectThatIsNotAMap() {
        assertDoesNotMatch("should not match a string", new IsMapContaining(ANYTHING, ANYTHING), "not a map");
    }
}
