package byTestCase.output;

import org.jmock.core.Constraint;
import org.jmock.core.constraint.IsArrayContaining;
import org.jmock.core.constraint.IsEqual;

import core.tests.IsInTest;

public class IsArrayContainingTest_3 extends AbstractConstraintsTest {

    Constraint constraint = new IsArrayContaining(new IsEqual("a"));

    public void testDoesNotMatchNull() {
        assertDoesNotMatch("should not match null", constraint, null);
    }
}
