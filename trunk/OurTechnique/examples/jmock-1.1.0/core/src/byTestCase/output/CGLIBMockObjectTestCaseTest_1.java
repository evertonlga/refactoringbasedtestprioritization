package byTestCase.output;

import org.jmock.cglib.MockObjectTestCase;
import junit.framework.TestCase;

public class CGLIBMockObjectTestCaseTest_1 extends TestCase {

    private static final String TEST_NAME = "TEST-NAME";

    public void testCanPassTestNameToConstructor() {
        TestCase testCase = new MockObjectTestCase(TEST_NAME) {
        };
        assertEquals("test name", TEST_NAME, testCase.getName());
    }
}
