package byTestCase.output;

import org.jmock.core.Constraint;
import org.jmock.core.constraint.IsEqual;

public class IsEqualTest_3 extends AbstractConstraintsTest {

    public void testComparesTheElementsOfAnObjectArray() {
        String[] s1 = new String[] { "a", "b" };
        String[] s2 = new String[] { "a", "b" };
        String[] s3 = new String[] { "c", "d" };
        String[] s4 = new String[] { "a", "b", "c", "d" };
        Constraint c = new IsEqual(s1);
        assertTrue("Should equal itself", c.eval(s1));
        assertTrue("Should equal a similar array", c.eval(s2));
        assertTrue("Should not equal a different array", !c.eval(s3));
        assertTrue("Should not equal a different sized array", !c.eval(s4));
    }
}
