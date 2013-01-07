package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestResult;
import org.jmock.core.Constraint;
import org.jmock.core.MockObjectSupportTestCase;
import org.jmock.core.constraint.IsAnything;
import org.jmock.core.constraint.IsNothing;
import org.jmock.util.Dummy;

public class MockObjectSupportTestCaseTest_11 extends TestCase {

    private static final String DUMMY_NAME = "DUMMY NAME";

    Constraint trueConstraint = new IsAnything("always true");

    Constraint falseConstraint = new IsNothing("always false");

    MockObjectSupportTestCase testCase;

    public void setUp() {
        testCase = new MockObjectSupportTestCase() {
        };
    }

    public void testHasConvenienceMethodForCreatingIsSameConstraints() {
        Object o1 = Dummy.newDummy("o1");
        Object o2 = Dummy.newDummy("o2");
        assertConstraintTrue(testCase.same(o1), o1);
        assertConstraintFalse(testCase.same(o1), o2);
    }

    private void assertConstraintTrue(Constraint constraint, Object argument) {
        assertTrue("expected <" + constraint + "> to return true when passed <" + argument + ">", constraint.eval(argument));
    }

    private void assertConstraintFalse(Constraint constraint, Object argument) {
        assertFalse("expected <" + constraint + "> to return false when passed <" + argument + ">", constraint.eval(argument));
    }

    interface ExampleInterface {

        void method1();
    }

    static class OneOffTestResult extends TestResult {

        public AssertionFailedError failure;

        public synchronized void addFailure(Test arg0, AssertionFailedError aFailure) {
            super.addFailure(arg0, aFailure);
            this.failure = aFailure;
        }

        public String message() {
            return failure.getMessage();
        }
    }
}
