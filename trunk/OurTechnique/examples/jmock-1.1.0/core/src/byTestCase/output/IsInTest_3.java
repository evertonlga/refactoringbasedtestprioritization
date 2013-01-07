package byTestCase.output;

import java.util.Arrays;
import java.util.Collection;
import org.jmock.core.Constraint;
import org.jmock.core.constraint.IsIn;

public class IsInTest_3 extends AbstractConstraintsTest {

    String[] elements = { "a", "b", "c" };

    public void testHasReadableDescription() {
        Constraint isIn = new IsIn(elements);
        assertEquals("description", "one of {\"a\", \"b\", \"c\"}", isIn.describeTo(new StringBuffer()).toString());
    }
}
