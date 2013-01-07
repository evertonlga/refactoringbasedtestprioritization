package byTestCase.output;

import junit.framework.TestCase;
import org.jmock.core.VerifyingTestCase;
import org.jmock.expectation.ExpectationCounter;
import test.jmock.core.testsupport.MockVerifiable;

public class VerifyingTestCaseTest_7 extends TestCase {

    public void testAllowsVerifiableObjectsToBeUnregistered() throws Throwable {
        ExampleTestCase testCase = new ExampleTestCase();
        MockVerifiable aVerifiable = new MockVerifiable();
        aVerifiable.setExpectedVerifyCalls(0);
        testCase.registerToVerify(aVerifiable);
        testCase.unregisterToVerify(aVerifiable);
        testCase.runBare();
        aVerifiable.verifyExpectations();
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
