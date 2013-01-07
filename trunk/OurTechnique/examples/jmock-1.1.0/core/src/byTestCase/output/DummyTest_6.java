package byTestCase.output;

import junit.framework.TestCase;
import org.jmock.util.Dummy;
import org.jmock.util.NotImplementedException;

public class DummyTest_6 extends TestCase {

    private static final String DUMMY_NAME = "DUMMY NAME";

    public void testThrowsNotImplementedExceptionFromEveryMethod() {
        ExampleInterface dummy = (ExampleInterface) Dummy.newDummy(ExampleInterface.class, DUMMY_NAME);
        try {
            dummy.method1();
            fail("NotImplementedException expected from method1");
        } catch (NotImplementedException ex) {
            assertTrue("error message should contain name of dummy object", ex.getMessage().indexOf(DUMMY_NAME) >= 0);
            assertTrue("error message should contain name of invokedMethod", ex.getMessage().indexOf("method1") >= 0);
        }
    }

    interface ExampleInterface {

        void method1();
    }
}
