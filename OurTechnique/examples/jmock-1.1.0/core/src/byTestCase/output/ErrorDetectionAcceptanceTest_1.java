package byTestCase.output;

import junit.framework.AssertionFailedError;
import org.jmock.cglib.MockObjectTestCase;

public class ErrorDetectionAcceptanceTest_1 extends MockObjectTestCase {

    public void testReportsUsefulErrorMessageWhenTryingToMockNonStaticInnerClass() {
        try {
            mock(NonStaticInnerClass.class);
        } catch (AssertionFailedError e) {
            assertTrue("should report error", e.getMessage().indexOf("non-static inner class") >= 0);
            assertTrue("should report name of inner class", e.getMessage().indexOf(NonStaticInnerClass.class.getName()) >= 0);
            return;
        }
        fail("should have failed");
    }

    public class NonStaticInnerClass {
    }
}
