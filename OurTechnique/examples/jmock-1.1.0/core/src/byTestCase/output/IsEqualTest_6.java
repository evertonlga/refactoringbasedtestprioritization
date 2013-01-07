package byTestCase.output;

import org.jmock.core.Constraint;
import org.jmock.core.constraint.IsEqual;

public class IsEqualTest_6 extends AbstractConstraintsTest {

    public void testIncludesTheResultOfCallingToStringOnItsArgumentInTheDescription() {
        final String argumentDescription = "ARGUMENT DESCRIPTION";
        Object argument = new Object() {

            public String toString() {
                return argumentDescription;
            }
        };
        Constraint c = new IsEqual(argument);
        assertTrue("should contain argument's toString in toString result", c.describeTo(new StringBuffer()).toString().indexOf(argumentDescription) >= 0);
    }
}
