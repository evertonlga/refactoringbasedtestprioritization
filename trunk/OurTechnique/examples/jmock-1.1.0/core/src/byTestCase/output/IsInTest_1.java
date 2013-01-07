package byTestCase.output;

import java.util.Arrays;
import java.util.Collection;
import org.jmock.core.Constraint;
import org.jmock.core.constraint.IsIn;

public class IsInTest_1 extends AbstractConstraintsTest {

    String[] elements = { "a", "b", "c" };

    public void testReturnsTrueIfArgumentIsInCollection() {
        Collection collection = Arrays.asList(elements);
        Constraint isIn = new IsIn(collection);
        assertMatches("a", isIn, "a");
        assertMatches("b", isIn, "b");
        assertMatches("c", isIn, "c");
        assertDoesNotMatch("d", isIn, "d");
    }
}
