package byTestCase.output;

import org.jmock.core.constraint.IsNothing;

public class IsNothingTest_2 extends AbstractConstraintsTest {

    public void testHasUsefulDefaultDescription() {
        IsNothing isNothing = new IsNothing();
        assertEquals("NOTHING", isNothing.describeTo(new StringBuffer()).toString());
    }
}
