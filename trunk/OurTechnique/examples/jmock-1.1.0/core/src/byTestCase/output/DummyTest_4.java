package byTestCase.output;

import junit.framework.TestCase;
import org.jmock.util.Dummy;
import org.jmock.util.NotImplementedException;

public class DummyTest_4 extends TestCase {

    private static final String DUMMY_NAME = "DUMMY NAME";

    public void testGetsAUsefulDefaultName() {
        Object dummy = Dummy.newDummy(ExampleInterface.class);
        assertEquals("should return name from toString", "dummyExampleInterface", dummy.toString());
    }

    interface ExampleInterface {

        void method1();
    }
}
