package byTestCase.output;

import junit.framework.TestCase;
import org.jmock.core.VerifyingTestCase;
import org.jmock.expectation.ExpectationCounter;
import test.jmock.core.testsupport.MockVerifiable;

public class VerifyingTestCaseTest_6 extends TestCase {

    public void testAutomaticallyVerifiesAnyObjectsRegisteredAsRequiringVerificatin() throws Throwable {
        ExampleTestCase testCase = new ExampleTestCase();
        MockVerifiable aVerifiable = new MockVerifiable();
        MockVerifiable anotherVerifiable = new MockVerifiable();
        aVerifiable.setExpectedVerifyCalls(1);
        anotherVerifiable.setExpectedVerifyCalls(1);
        testCase.registerToVerify(aVerifiable);
        testCase.registerToVerify(anotherVerifiable);
        testCase.runBare();
        aVerifiable.verifyExpectations();
        anotherVerifiable.verifyExpectations();
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
