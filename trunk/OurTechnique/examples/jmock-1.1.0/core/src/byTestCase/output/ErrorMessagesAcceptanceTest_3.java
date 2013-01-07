package byTestCase.output;

import junit.framework.AssertionFailedError;
import org.jmock.Mock;
import org.jmock.MockObjectTestCase;
import org.jmock.core.DynamicMockError;
import atest.jmock.Types;
import atest.jmock.Types.WithTwoMethods;

public class ErrorMessagesAcceptanceTest_3 extends MockObjectTestCase {

    private static final String MOCK_NAME = "MOCK_NAME";

    public void testShowsExpectationThatDoesNotVerify() {
        String arg1 = "arg1";
        Object arg2 = new Object();
        String expectedMethod = "expected once: twoArgsReturnsInt( eq(\"" + arg1 + "\"), same(<" + arg2 + ">) ), returns <1>";
        Mock mock = mock(Types.WithTwoMethods.class, MOCK_NAME);
        unregisterToVerify(mock);
        mock.expects(once()).method("twoArgsReturnsInt").with(eq(arg1), same(arg2)).will(returnValue(1));
        try {
            mock.verify();
        } catch (AssertionFailedError ex) {
            String message = ex.getMessage();
            assertStringContains("error message should contain expected invokedMethod", message, expectedMethod);
            assertStringContains("error message should describe error", message, "was not invoked");
            return;
        }
        fail("expected AssertionFailedError");
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
