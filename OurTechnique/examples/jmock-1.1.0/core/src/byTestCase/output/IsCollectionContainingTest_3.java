package byTestCase.output;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import org.jmock.core.Constraint;
import org.jmock.core.constraint.IsCollectionContaining;
import org.jmock.core.constraint.IsEqual;

import core.tests.IsInTest;

public class IsCollectionContainingTest_3 extends AbstractConstraintsTest {

    Constraint constraint = new IsCollectionContaining(new IsEqual("a"));

    public void testDoesNotMatchNull() {
        assertDoesNotMatch("should not match null", constraint, null);
    }

    private Collection collectionOf(String[] abc) {
        return Arrays.asList(abc);
    }

    private Collection emptyCollection() {
        return Collections.EMPTY_LIST;
    }
}
