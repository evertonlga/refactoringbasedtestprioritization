package byTestCase.output;

import org.jmock.core.Constraint;
import org.jmock.core.constraint.IsEqual;

public class IsEqualTest_2 extends AbstractConstraintsTest {

    public void testCanCompareNullValues() {
        Integer i1 = new Integer(1);
        Constraint c = new IsEqual(i1);
        assertTrue(!c.eval(null));
        Constraint nullEquals = new IsEqual(null);
        assertTrue(nullEquals.eval(null));
        assertTrue(!nullEquals.eval(i1));
    }
}
