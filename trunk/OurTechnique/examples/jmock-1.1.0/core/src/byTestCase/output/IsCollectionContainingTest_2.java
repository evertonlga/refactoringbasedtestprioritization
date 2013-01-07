package byTestCase.output;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import org.jmock.core.Constraint;
import org.jmock.core.constraint.IsCollectionContaining;
import org.jmock.core.constraint.IsEqual;

import core.tests.IsInTest;

public class IsCollectionContainingTest_2 extends AbstractConstraintsTest {

    Constraint constraint = new IsCollectionContaining(new IsEqual("a"));

    public void testDoesNotMatchCollectionThatDoesntContainAnElementMatchingTheGivenConstraint() {
        assertDoesNotMatch("should not match list that doesn't contain 'a'", constraint, collectionOf(new String[] { "b", "c" }));
        assertDoesNotMatch("should not match empty list", constraint, emptyCollection());
    }

    private Collection collectionOf(String[] abc) {
        return Arrays.asList(abc);
    }

    private Collection emptyCollection() {
        return Collections.EMPTY_LIST;
    }
}
