package byTestCase.output;

import org.jmock.core.constraint.IsNothing;

public class IsNothingTest_3 extends AbstractConstraintsTest {

    public void testCanOverrideDescription() {
        String description = "description";
        IsNothing isNothing = new IsNothing(description);
        assertEquals(description, isNothing.describeTo(new StringBuffer()).toString());
    }
}
