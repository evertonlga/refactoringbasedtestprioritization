package byTestCase.output;

import junit.framework.TestCase;
import org.jmock.MockObjectTestCase;
import org.jmock.core.Verifiable;
import org.jmock.expectation.ExpectationList;

public class MockObjectTestCaseTest_1 extends TestCase {

    private SampleMockObjectTestCase testCase;

    ExpectationList requiresVerification;

    public void setUp() {
        requiresVerification = new ExpectationList("registerToVerify #arguments");
        testCase = new SampleMockObjectTestCase() {
        };
    }

    public void testCanBeConstructedWithAName() {
        String name = "NAME";
        MockObjectTestCase namedTestCase = new MockObjectTestCase(name) {
        };
        assertEquals("name", name, namedTestCase.getName());
    }

    class SampleMockObjectTestCase extends MockObjectTestCase {

        public void registerToVerify(Verifiable verifiable) {
            requiresVerification.addActual(verifiable.toString());
        }

        public void testMethod() {
        }
    }

    interface ExampleInterface {

        void expectedMethod();
    }
}
