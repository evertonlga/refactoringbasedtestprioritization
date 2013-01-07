package byTestCase.output;

import junit.framework.TestCase;
import org.jmock.MockObjectTestCase;
import org.jmock.core.Verifiable;
import org.jmock.expectation.ExpectationList;

public class MockObjectTestCaseTest_2 extends TestCase {

    private SampleMockObjectTestCase testCase;

    ExpectationList requiresVerification;

    public void setUp() {
        requiresVerification = new ExpectationList("registerToVerify #arguments");
        testCase = new SampleMockObjectTestCase() {
        };
    }

    public void testRegistersAllMocksItCreatesForVerification() throws Throwable {
        String roleName = "ROLE-NAME";
        requiresVerification.addExpected(roleName);
        testCase.mock(ExampleInterface.class, roleName);
        testCase.verify();
//        requiresVerification.verify();
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
