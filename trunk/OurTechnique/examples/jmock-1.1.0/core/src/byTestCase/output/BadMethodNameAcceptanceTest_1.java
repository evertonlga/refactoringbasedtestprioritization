package byTestCase.output;

import junit.framework.AssertionFailedError;
import org.jmock.MockObjectTestCase;
import org.jmock.Mock;
import org.jmock.expectation.AssertMo;
import atest.jmock.Types;

public class BadMethodNameAcceptanceTest_1 extends MockObjectTestCase {

    private static final String INVALID_METHOD_NAME = "invalidMethodName()";

    private static final String METHOD_NAME_NOT_IN_MOCKED_INTERFACE = "methodNameNotInMockedInterface";

    public void testInvalidMethodNameCausesTestError() {
        Mock mock = mock(Types.class);
        try {
            mock.stubs().method(INVALID_METHOD_NAME);
        } catch (IllegalArgumentException ex) {
            AssertMo.assertIncludes("should contain invalid method name", INVALID_METHOD_NAME, ex.getMessage());
            return;
        }
        fail("should have caused test error");
    }
}
