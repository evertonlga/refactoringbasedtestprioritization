package byTestCase.output;

import org.jmock.core.constraint.IsSame;

public class IsSameTest_3 extends AbstractConstraintsTest {

    public void testReturnsReadableDescriptionFromToStringWhenInitialisedWithNull() {
        IsSame isSame = new IsSame(null);
        assertEquals("description", "same(null)", isSame.describeTo(new StringBuffer()).toString());
    }
}
