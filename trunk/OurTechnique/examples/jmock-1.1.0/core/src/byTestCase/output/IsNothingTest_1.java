package byTestCase.output;

import org.jmock.core.constraint.IsNothing;

public class IsNothingTest_1 extends AbstractConstraintsTest {

    public void testAlwaysEvaluatesToFalse() {
        IsNothing isNothing = new IsNothing();
        assertFalse(isNothing.eval(null));
        assertFalse(isNothing.eval(new Object()));
    }
}
