package byTestCase.output;

import org.jmock.core.constraint.Or;

public class OrTest_2 extends AbstractConstraintsTest {

    public void testEvaluatesArgumentsLeftToRightAndShortCircuitsEvaluation() {
        assertTrue(new Or(TRUE_CONSTRAINT, NEVER_EVALUATED).eval(ARGUMENT_IGNORED));
    }
}
