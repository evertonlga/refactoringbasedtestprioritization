package byTestCase.output;

import org.jmock.core.constraint.IsGreaterThan;

public class IsGreaterThanTest_1 extends AbstractConstraintsTest {

    public void testEvaluatesToTrueIfArgumentIsGreaterThanAComparableObject() {
        IsGreaterThan c = new IsGreaterThan(new Integer(1));
        assertFalse(c.eval(new Integer(0)));
        assertFalse(c.eval(new Integer(1)));
        assertTrue(c.eval(new Integer(2)));
    }
}
