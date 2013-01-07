package byTestCase.output;

import org.jmock.core.Constraint;
import org.jmock.core.constraint.IsArrayContaining;
import org.jmock.core.constraint.IsEqual;

import core.tests.IsInTest;

public class IsArrayContainingTest_2 extends AbstractConstraintsTest {

    Constraint constraint = new IsArrayContaining(new IsEqual("a"));

    public void testDoesNotMatchAnArrayThatDoesntContainAnElementMatchingTheGivenConstraint() {
        assertDoesNotMatch("should not match array that doesn't contain 'a'", constraint, new String[] { "b", "c" });
        assertDoesNotMatch("should not match empty array", constraint, new String[0]);
    }
}
