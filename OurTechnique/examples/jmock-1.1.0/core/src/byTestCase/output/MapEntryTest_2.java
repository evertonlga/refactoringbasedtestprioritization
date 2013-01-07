package byTestCase.output;

import junit.framework.TestCase;
import org.jmock.expectation.MapEntry;

public class MapEntryTest_2 extends TestCase {

    public void testHashCode() {
        assertEquals("Should be equal hashcodes", new MapEntry("A", "A".getBytes()).hashCode(), new MapEntry("A", "A".getBytes()).hashCode());
    }
}
