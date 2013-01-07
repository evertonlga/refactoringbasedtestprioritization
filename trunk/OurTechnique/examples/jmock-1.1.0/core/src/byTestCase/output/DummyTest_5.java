package byTestCase.output;

import junit.framework.TestCase;
import org.jmock.util.Dummy;
import org.jmock.util.NotImplementedException;

public class DummyTest_5 extends TestCase {

    private static final String DUMMY_NAME = "DUMMY NAME";

    public void testImplementsEqualsByComparingObjectReferences() {
        Object dummy = Dummy.newDummy(ExampleInterface.class);
        assertTrue("should be equal to itself", dummy.equals(dummy));
        assertFalse("should not be equal to another object", dummy.equals(new Object()));
    }

    interface ExampleInterface {

        void method1();
    }
}
