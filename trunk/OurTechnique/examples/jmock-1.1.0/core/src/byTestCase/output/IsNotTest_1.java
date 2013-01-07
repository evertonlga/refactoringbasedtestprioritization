package byTestCase.output;

import org.jmock.core.constraint.IsNot;

public class IsNotTest_1 extends AbstractConstraintsTest {

    public void testEvaluatesToTheTheLogicalNegationOfAnotherConstraint() {
        assertFalse(new IsNot(TRUE_CONSTRAINT).eval(ARGUMENT_IGNORED));
        assertTrue(new IsNot(FALSE_CONSTRAINT).eval(ARGUMENT_IGNORED));
    }
}
