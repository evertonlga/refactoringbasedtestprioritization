package byTestCase.output;

import junit.framework.TestCase;
import org.jmock.core.VerifyingTestCase;
import org.jmock.expectation.ExpectationCounter;
import test.jmock.core.testsupport.MockVerifiable;

public class VerifyingTestCaseTest_3 extends TestCase {

    public void testVerificationCanBeOverridden() throws Throwable {
        final ExpectationCounter overriddenVerifyCalls = new ExpectationCounter("overridden verify #calls");
        ExampleTestCase testCase = new ExampleTestCase() {

            public void verify() {
                overriddenVerifyCalls.inc();
            }
        };
        overriddenVerifyCalls.setExpected(1);
        testCase.runBare();
        overriddenVerifyCalls.verify();
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
