package byTestCase.output;

import org.jmock.core.constraint.IsAnything;

public class IsAnythingTest_3 extends AbstractConstraintsTest {

    public void testCanOverrideDescription() {
        String description = "description";
        IsAnything isAnything = new IsAnything(description);
        assertEquals(description, isAnything.describeTo(new StringBuffer()).toString());
    }
}
