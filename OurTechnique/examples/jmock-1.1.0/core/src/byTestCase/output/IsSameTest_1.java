package byTestCase.output;

import org.jmock.core.constraint.IsSame;

public class IsSameTest_1 extends AbstractConstraintsTest {

    public void testEvaluatesToTrueIfArgumentIsReferenceToASpecifiedObject() {
        Object o1 = new Object();
        Object o2 = new Object();
        IsSame isSame = new IsSame(o1);
        assertTrue(isSame.eval(o1));
        assertFalse(isSame.eval(o2));
    }
}
