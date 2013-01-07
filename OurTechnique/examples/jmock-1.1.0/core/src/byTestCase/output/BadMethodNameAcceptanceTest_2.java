package byTestCase.output;

import junit.framework.AssertionFailedError;
import org.jmock.MockObjectTestCase;
import org.jmock.Mock;
import org.jmock.expectation.AssertMo;
import atest.jmock.Types;

public class BadMethodNameAcceptanceTest_2 extends MockObjectTestCase {

    private static final String INVALID_METHOD_NAME = "invalidMethodName()";

    private static final String METHOD_NAME_NOT_IN_MOCKED_INTERFACE = "methodNameNotInMockedInterface";

    public void testMethodNameNotInMockedTypeCausesTestFailure() {
        Mock mock = mock(Types.class);
        try {
            mock.stubs().method(METHOD_NAME_NOT_IN_MOCKED_INTERFACE);
        } catch (AssertionFailedError ex) {
            AssertMo.assertIncludes("should contain invalid method name", METHOD_NAME_NOT_IN_MOCKED_INTERFACE, ex.getMessage());
            return;
        }
        fail("should have caused test failure");
    }
}
