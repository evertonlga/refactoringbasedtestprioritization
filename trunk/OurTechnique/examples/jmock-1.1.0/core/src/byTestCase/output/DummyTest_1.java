package byTestCase.output;

import junit.framework.TestCase;
import org.jmock.util.Dummy;
import org.jmock.util.NotImplementedException;

public class DummyTest_1 extends TestCase {

    private static final String DUMMY_NAME = "DUMMY NAME";

    public void testCanCreateDummyObjectsThatReturnANameFromString() {
        Object dummy = Dummy.newDummy(DUMMY_NAME);
        assertEquals("should return name from toString", DUMMY_NAME, dummy.toString());
    }

    interface ExampleInterface {

        void method1();
    }
}
