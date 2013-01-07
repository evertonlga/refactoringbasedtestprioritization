package byTestCase.output;

import org.jmock.core.constraint.IsAnything;

public class IsAnythingTest_1 extends AbstractConstraintsTest {

    public void testAlwaysEvaluatesToTrue() {
        IsAnything isAnything = new IsAnything();
        assertTrue(isAnything.eval(null));
        assertTrue(isAnything.eval(new Object()));
    }
}
