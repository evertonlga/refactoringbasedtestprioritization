package byTestCase.output;

import org.jmock.core.constraint.StringStartsWith;

public class StringStartsWithTest_2 extends AbstractConstraintsTest {

    static final String EXCERPT = "EXCERPT";

    StringStartsWith stringStartsWith;

    public void setUp() {
        stringStartsWith = new StringStartsWith(EXCERPT);
    }

    public void testEvaluatesToTrueIfArgumentIsEqualToSubstring() {
        assertTrue("should be true if excerpt is entire string", stringStartsWith.eval(EXCERPT));
    }
}
