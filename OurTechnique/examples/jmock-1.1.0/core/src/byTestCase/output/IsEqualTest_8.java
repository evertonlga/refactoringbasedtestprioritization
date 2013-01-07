package byTestCase.output;

import org.jmock.core.Constraint;
import org.jmock.core.constraint.IsEqual;

public class IsEqualTest_8 extends AbstractConstraintsTest {

    public void testReturnsGoodDescriptionIfCreatedWithNullReference() {
        assertEquals("should get a description even if argument is null", "eq(null)", new IsEqual(null).describeTo(new StringBuffer()).toString());
    }
}
