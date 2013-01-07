package byTestCase.output;

import java.util.HashMap;
import java.util.Map;
import org.jmock.core.Constraint;
import org.jmock.core.constraint.IsAnything;
import org.jmock.core.constraint.IsEqual;
import org.jmock.core.constraint.IsMapContaining;

public class IsMapContainingTest_3 extends AbstractConstraintsTest {

    private static final IsAnything ANYTHING = IsAnything.INSTANCE;

    public void testDoesNotMatchNull() {
        assertDoesNotMatch("should not match a string", new IsMapContaining(ANYTHING, ANYTHING), null);
    }
}
