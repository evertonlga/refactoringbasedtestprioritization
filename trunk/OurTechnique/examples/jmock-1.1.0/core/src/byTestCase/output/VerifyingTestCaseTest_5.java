package byTestCase.output;

import junit.framework.TestCase;
import org.jmock.core.VerifyingTestCase;
import org.jmock.expectation.ExpectationCounter;
import test.jmock.core.testsupport.MockVerifiable;

public class VerifyingTestCaseTest_5 extends TestCase {

    public void testOverridingSetUpAndTearDownDoesNotAffectVerification() throws Throwable {
        ExampleTestCase testCase = new ExampleTestCase() {

            public void setUp() {
            }

            public void tearDown() {
            }
        };
        testCase.setExpectedVerifyCalls(1);
        testCase.runBare();
        testCase.verifyExpectations();
    }

    public static class ExampleTestCase extends VerifyingTestCase {

        private MockVerifiable verifiableField = new MockVerifiable();

        public ExampleTestCase() {
            setName("testMethod");
        }

        public void setExpectedVerifyCalls(int n) {
            verifiableField.verifyCalls.setExpected(n);
        }

        public void verifyExpectations() {
            verifiableField.verifyExpectations();
        }

        public void testMethod() {
        }
    }
}
