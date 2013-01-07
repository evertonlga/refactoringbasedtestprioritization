package byTestCase.output;

import org.jmock.core.constraint.IsNull;

public class IsNullTest_1 extends AbstractConstraintsTest {

    public void testEvaluatesToTrueIfArgumentIsNull() {
        IsNull isNull = new IsNull();
        assertTrue(isNull.eval(null));
        assertFalse(isNull.eval(ANY_NON_NULL_ARGUMENT));
    }
}
