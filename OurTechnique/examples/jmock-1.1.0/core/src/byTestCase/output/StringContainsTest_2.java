package byTestCase.output;

import org.jmock.core.constraint.StringContains;

public class StringContainsTest_2 extends AbstractConstraintsTest {

    static final String EXCERPT = "EXCERPT";

    StringContains stringContains;

    public void setUp() {
        stringContains = new StringContains(EXCERPT);
    }

    public void testEvaluatesToTrueIfArgumentIsEqualToSubstring() {
        assertTrue("should be true if excerpt is entire string", stringContains.eval(EXCERPT));
    }
}
