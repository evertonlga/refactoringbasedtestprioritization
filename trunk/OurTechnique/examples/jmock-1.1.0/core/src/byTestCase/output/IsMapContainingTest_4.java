package byTestCase.output;

import java.util.HashMap;
import java.util.Map;
import org.jmock.core.Constraint;
import org.jmock.core.constraint.IsAnything;
import org.jmock.core.constraint.IsEqual;
import org.jmock.core.constraint.IsMapContaining;

public class IsMapContainingTest_4 extends AbstractConstraintsTest {

    private static final IsAnything ANYTHING = IsAnything.INSTANCE;

    public void testHasReadableDescription() {
        Constraint constraint = new IsMapContaining(new IsEqual("a"), new IsEqual("A"));
        assertEquals("map containing [eq(\"a\")->eq(\"A\")]", constraint.describeTo(new StringBuffer()).toString());
    }
}
