package byTestCase.output;

import org.jmock.core.Constraint;
import org.jmock.core.constraint.HasToString;
import org.jmock.core.constraint.IsEqual;
import junit.framework.TestCase;

public class HasToStringTest_2 extends TestCase {

    private static final String TO_STRING_RESULT = "toString result";

    private static final Object ARG = new Object() {

        public String toString() {
            return TO_STRING_RESULT;
        }
    };

    public void testHasReadableDescription() {
        Constraint toStringConstraint = new IsEqual(TO_STRING_RESULT);
        Constraint constraint = new HasToString(toStringConstraint);
        assertEquals("toString(" + descriptionOf(toStringConstraint) + ")", descriptionOf(constraint));
    }

    private String descriptionOf(Constraint constraint) {
        return constraint.describeTo(new StringBuffer()).toString();
    }
}
