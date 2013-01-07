package byTestCase.output;

import org.jmock.cglib.MockObjectTestCase;
import junit.framework.TestCase;

public class CGLIBMockObjectTestCaseTest_2 extends TestCase {

    private static final String TEST_NAME = "TEST-NAME";

    public void testHasNoArgumentConstructor() {
        TestCase testCase = new MockObjectTestCase() {
        };
        testCase.setName(TEST_NAME);
        assertEquals("test name", TEST_NAME, testCase.getName());
    }
}
