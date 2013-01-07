package byTestCase.output;

import org.jmock.core.constraint.And;

public class AndTest_1 extends AbstractConstraintsTest {

    public void testEvaluatesToTheTheLogicalConjunctionOfTwoOtherConstraints() {
        assertTrue(new And(TRUE_CONSTRAINT, TRUE_CONSTRAINT).eval(ARGUMENT_IGNORED));
        assertFalse(new And(FALSE_CONSTRAINT, TRUE_CONSTRAINT).eval(ARGUMENT_IGNORED));
        assertFalse(new And(TRUE_CONSTRAINT, FALSE_CONSTRAINT).eval(ARGUMENT_IGNORED));
        assertFalse(new And(FALSE_CONSTRAINT, FALSE_CONSTRAINT).eval(ARGUMENT_IGNORED));
    }
}
