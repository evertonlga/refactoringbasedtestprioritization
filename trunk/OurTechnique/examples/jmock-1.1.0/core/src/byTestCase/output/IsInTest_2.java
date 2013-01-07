package byTestCase.output;

import java.util.Arrays;
import java.util.Collection;
import org.jmock.core.Constraint;
import org.jmock.core.constraint.IsIn;

public class IsInTest_2 extends AbstractConstraintsTest {

    String[] elements = { "a", "b", "c" };

    public void testReturnsTrueIfArgumentIsInArray() {
        Constraint isIn = new IsIn(elements);
        assertMatches("a", isIn, "a");
        assertMatches("b", isIn, "b");
        assertMatches("c", isIn, "c");
        assertDoesNotMatch("d", isIn, "d");
    }
}
