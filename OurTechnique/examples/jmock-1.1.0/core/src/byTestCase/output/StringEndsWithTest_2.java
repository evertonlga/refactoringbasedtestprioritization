package byTestCase.output;

import org.jmock.core.constraint.StringEndsWith;

public class StringEndsWithTest_2 extends AbstractConstraintsTest {

    static final String EXCERPT = "EXCERPT";

    StringEndsWith stringEndsWith;

    public void setUp() {
        stringEndsWith = new StringEndsWith(EXCERPT);
    }

    public void testEvaluatesToTrueIfArgumentIsEqualToSubstring() {
        assertTrue("should be true if excerpt is entire string", stringEndsWith.eval(EXCERPT));
    }
}
