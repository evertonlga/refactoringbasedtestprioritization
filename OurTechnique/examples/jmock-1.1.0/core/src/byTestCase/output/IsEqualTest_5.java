package byTestCase.output;

import org.jmock.core.Constraint;
import org.jmock.core.constraint.IsEqual;

public class IsEqualTest_5 extends AbstractConstraintsTest {

    public void testRecursivelyTestsElementsOfArrays() {
        int[][] i1 = new int[][] { { 1, 2 }, { 3, 4 } };
        int[][] i2 = new int[][] { { 1, 2 }, { 3, 4 } };
        int[][] i3 = new int[][] { { 5, 6 }, { 7, 8 } };
        int[] i4 = new int[] { 1, 2, 3, 4 };
        int[][] i5 = new int[][] { { 1, 2, 3, 4 }, { 3, 4 } };
        Constraint c = new IsEqual(i1);
        assertTrue("Should equal itself", c.eval(i1));
        assertTrue("Should equal a similar array", c.eval(i2));
        assertTrue("Should not equal a different array", !c.eval(i3));
        assertTrue("Should not equal a different sized array", !c.eval(i4));
        assertTrue("Should not equal a different sized subarray", !c.eval(i5));
    }
}
