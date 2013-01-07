package byTestCase.output;

import org.jmock.core.Constraint;
import org.jmock.core.constraint.IsArrayContaining;
import org.jmock.core.constraint.IsEqual;

import core.tests.IsInTest;

public class IsArrayContainingTest_1 extends AbstractConstraintsTest {

    Constraint constraint = new IsArrayContaining(new IsEqual("a"));

    public void testMatchesAnArrayThatContainsAnElementMatchingTheGivenConstraint() {
        assertMatches("should match array that contains 'a'", constraint, new String[] { "a", "b", "c" });
    }
}
