package byTestCase.output;

import org.jmock.core.constraint.IsAnything;

public class IsAnythingTest_2 extends AbstractConstraintsTest {

    public void testHasUsefulDefaultDescription() {
        IsAnything isAnything = new IsAnything();
        assertEquals("ANYTHING", isAnything.describeTo(new StringBuffer()).toString());
    }
}
