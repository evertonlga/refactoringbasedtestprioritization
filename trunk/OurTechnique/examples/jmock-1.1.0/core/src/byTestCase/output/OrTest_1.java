package byTestCase.output;

import org.jmock.core.constraint.Or;

public class OrTest_1 extends AbstractConstraintsTest {

    public void testEvaluatesToTheTheLogicalDisjunctionOfTwoOtherConstraint() {
        assertTrue(new Or(TRUE_CONSTRAINT, TRUE_CONSTRAINT).eval(ARGUMENT_IGNORED));
        assertTrue(new Or(FALSE_CONSTRAINT, TRUE_CONSTRAINT).eval(ARGUMENT_IGNORED));
        assertTrue(new Or(TRUE_CONSTRAINT, FALSE_CONSTRAINT).eval(ARGUMENT_IGNORED));
        assertFalse(new Or(FALSE_CONSTRAINT, FALSE_CONSTRAINT).eval(ARGUMENT_IGNORED));
    }
}
