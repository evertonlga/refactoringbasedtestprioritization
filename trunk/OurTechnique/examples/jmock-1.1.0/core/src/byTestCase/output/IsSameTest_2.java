package byTestCase.output;

import org.jmock.core.constraint.IsSame;

public class IsSameTest_2 extends AbstractConstraintsTest {

    public void testReturnsReadableDescriptionFromToString() {
        IsSame isSame = new IsSame("ARG");
        assertEquals("description", "same(\"ARG\")", isSame.describeTo(new StringBuffer()).toString());
    }
}
