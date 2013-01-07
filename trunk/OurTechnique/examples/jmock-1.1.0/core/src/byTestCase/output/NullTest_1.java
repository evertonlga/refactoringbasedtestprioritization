package byTestCase.output;

import junit.framework.TestCase;
import org.jmock.expectation.Null;

public class NullTest_1 extends TestCase {

    public void testEquals() {
        assertEquals("Should be same value", new Null(), new Null());
        assertEquals("Should be same hashCode", new Null().hashCode(), new Null().hashCode());
        assertEquals("Should be same value", new Null("one"), new Null("two"));
        assertEquals("Should be same hashCode", new Null("one").hashCode(), new Null("two").hashCode());
        assertEquals("Not equal to something else", false, new Null("one").equals("one"));
        assertEquals("Not equal to something else", false, new Null().equals(new Integer(2)));
    }
}
