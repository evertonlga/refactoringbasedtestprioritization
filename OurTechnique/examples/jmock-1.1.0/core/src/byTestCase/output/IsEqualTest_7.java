package byTestCase.output;

import org.jmock.core.Constraint;
import org.jmock.core.constraint.IsEqual;

public class IsEqualTest_7 extends AbstractConstraintsTest {

    public void testReturnsAnObviousDescriptionIfCreatedWithANestedConstraintByMistake() {
        IsEqual innerConstraint = new IsEqual("NestedConstraint");
        assertEquals("should get an obvious description to reflect nesting if viewed in a debugger", "eq(<" + innerConstraint.toString() + ">)", (new IsEqual(innerConstraint)).describeTo(new StringBuffer()).toString());
    }
}
