package byTestCase.output;

import org.jmock.core.constraint.And;

public class AndTest_2 extends AbstractConstraintsTest {

    public void testEvaluatesArgumentsLeftToRightAndShortCircuitsEvaluation() {
        assertFalse(new And(FALSE_CONSTRAINT, NEVER_EVALUATED).eval(ARGUMENT_IGNORED));
    }
}
