package byTestCase.output;

import org.jmock.core.constraint.IsLessThan;

public class IsLessThanTest_1 extends AbstractConstraintsTest {

    public void testEvaluatesToTrueIfArgumentIsLessThanAComparableObject() {
        IsLessThan c = new IsLessThan(new Integer(1));
        assertTrue(c.eval(new Integer(0)));
        assertFalse(c.eval(new Integer(1)));
        assertFalse(c.eval(new Integer(2)));
    }
}
