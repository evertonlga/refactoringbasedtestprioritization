package byTestCase.output;

import org.jmock.core.Constraint;
import org.jmock.core.constraint.HasToString;
import org.jmock.core.constraint.IsEqual;
import junit.framework.TestCase;

public class HasToStringTest_1 extends TestCase {

    private static final String TO_STRING_RESULT = "toString result";

    private static final Object ARG = new Object() {

        public String toString() {
            return TO_STRING_RESULT;
        }
    };

    public void testPassesResultOfToStringToNestedConstraint() {
        Constraint passingConstraint = new HasToString(new IsEqual(TO_STRING_RESULT));
        Constraint failingConstraint = new HasToString(new IsEqual("OTHER STRING"));
        assertTrue("should pass", passingConstraint.eval(ARG));
        assertFalse("should fail", failingConstraint.eval(ARG));
    }

    private String descriptionOf(Constraint constraint) {
        return constraint.describeTo(new StringBuffer()).toString();
    }
}
