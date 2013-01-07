package byTestCase.output;

import junit.framework.TestCase;
import org.jmock.util.Dummy;
import org.jmock.util.NotImplementedException;

public class DummyTest_2 extends TestCase {

    private static final String DUMMY_NAME = "DUMMY NAME";

    public void testImplementsAGivenInterface() {
        Object dummy = Dummy.newDummy(ExampleInterface.class);
        assertTrue("should be instanceof ExampleInterface", dummy instanceof ExampleInterface);
    }

    interface ExampleInterface {

        void method1();
    }
}
