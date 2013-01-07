package byTestCase.output;

import org.jmock.core.Constraint;
import org.jmock.core.constraint.IsArrayContaining;
import org.jmock.core.constraint.IsEqual;

import core.tests.IsInTest;

public class IsArrayContainingTest_4 extends AbstractConstraintsTest {

    Constraint constraint = new IsArrayContaining(new IsEqual("a"));

    public void testDoesNotMatchObjectThatIsNotAnArray() {
        assertDoesNotMatch("should not match empty list", constraint, "not a collection");
    }
}
