package byTestCase.output;

import junit.framework.AssertionFailedError;
import org.jmock.Mock;
import org.jmock.MockObjectTestCase;
import org.jmock.core.DynamicMockError;
import atest.jmock.Types;
import atest.jmock.Types.WithTwoMethods;

public class ErrorMessagesAcceptanceTest_5 extends MockObjectTestCase {

    private static final String MOCK_NAME = "MOCK_NAME";

    public void testReportsFailureWhenStubReturnValueIsNotSet() {
        Mock mock = mock(Types.WithTwoMethods.class);
        mock.expects(once()).method("twoArgsReturnsInt").with(ANYTHING, ANYTHING);
        try {
            ((Types.WithTwoMethods) mock.proxy()).twoArgsReturnsInt("arg1", "arg2");
        } catch (DynamicMockError error) {
            String errorMessage = error.getMessage();
            assertStringContains("should report no return value", errorMessage, "tried to return null value");
            return;
        }
        fail("expected DynamicMockError");
    }

    public static void assertStringContains(String message, String string, String substring) {
        assertTrue(message + ": expected \"" + string + "\" to contain \"" + substring + "\"", string.indexOf(substring) >= 0);
    }

    public static void assertSubstringOrder(String message, String string, String earlierSubstring, String laterSubstring) {
        assertStringContains(message, string, earlierSubstring);
        assertStringContains(message, string, laterSubstring);
        int earlierIndex = string.indexOf(earlierSubstring);
        int laterIndex = string.indexOf(laterSubstring);
        assertTrue(message + ": expected \"" + earlierSubstring + "\" " + "to appear before \"" + laterSubstring + "\" in \"" + string + "\"", earlierIndex < laterIndex);
    }
}
