package byTestCase.output;

import org.jmock.core.Constraint;
import org.jmock.core.constraint.IsEqual;

public class IsEqualTest_4 extends AbstractConstraintsTest {

    public void testComparesTheElementsOfAnArrayOfPrimitiveTypes() {
        int[] i1 = new int[] { 1, 2 };
        int[] i2 = new int[] { 1, 2 };
        int[] i3 = new int[] { 3, 4 };
        int[] i4 = new int[] { 1, 2, 3, 4 };
        Constraint c = new IsEqual(i1);
        assertTrue("Should equal itself", c.eval(i1));
        assertTrue("Should equal a similar array", c.eval(i2));
        assertTrue("Should not equal a different array", !c.eval(i3));
        assertTrue("Should not equal a different sized array", !c.eval(i4));
    }
}
