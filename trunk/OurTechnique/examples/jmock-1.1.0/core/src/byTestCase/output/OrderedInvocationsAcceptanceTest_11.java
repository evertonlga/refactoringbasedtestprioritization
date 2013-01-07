package byTestCase.output;

import junit.framework.AssertionFailedError;
import org.jmock.Mock;
import org.jmock.MockObjectTestCase;
import org.jmock.core.DynamicMockError;
import org.jmock.expectation.AssertMo;

public class OrderedInvocationsAcceptanceTest_11 extends MockObjectTestCase {

    private Mock mock;

    private ExampleInterface proxy;

    public void setUp() {
        mock = mock(ExampleInterface.class, "mock");
        proxy = (ExampleInterface) mock.proxy();
    }

    public void testDetectsMissingIDs() {
        String missingID = "MISSING-ID";
        try {
            mock.stubs().method("hello").after(missingID);
        } catch (AssertionFailedError ex) {
            AssertMo.assertIncludes("error message contains missing id", missingID, ex.getMessage());
            return;
        }
        fail("should have failed");
    }

    public static interface ExampleInterface {

        void hello();

        void goodbye();

        void moreTeaVicar();

        int count();
    }
}
