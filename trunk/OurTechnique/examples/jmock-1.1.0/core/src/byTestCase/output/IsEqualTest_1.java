package byTestCase.output;

import org.jmock.core.Constraint;
import org.jmock.core.constraint.IsEqual;

public class IsEqualTest_1 extends AbstractConstraintsTest {

    public void testComparesObjectsUsingEqualsMethod() {
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(2);
        Constraint c = new IsEqual(i1);
        assertTrue(c.eval(i1));
        assertTrue(c.eval(new Integer(1)));
        assertTrue(!c.eval(i2));
    }
}
