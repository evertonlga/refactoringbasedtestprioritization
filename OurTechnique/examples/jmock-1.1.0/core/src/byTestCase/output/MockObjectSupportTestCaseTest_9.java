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

public class MockObjectSupportTestCaseTest_9 extends TestCase {

    private static final String DUMMY_NAME = "DUMMY NAME";

    Constraint trueConstraint = new IsAnything("always true");

    Constraint falseConstraint = new IsNothing("always false");

    MockObjectSupportTestCase testCase;

    public void setUp() {
        testCase = new MockObjectSupportTestCase() {
        };
    }

    public void testConvenienceMethodForCreatingIsEqualConstraintsIsOverloadedForPrimitiveTypes() {
        assertConstraintTrue(testCase.eq(true), new Boolean(true));
        assertConstraintTrue(testCase.eq(false), new Boolean(false));
        assertConstraintTrue(testCase.eq((byte) 1), new Byte((byte) 1));
        assertConstraintTrue(testCase.eq((short) 1), new Short((short) 1));
        assertConstraintTrue(testCase.eq('a'), new Character('a'));
        assertConstraintTrue(testCase.eq(1), new Integer(1));
        assertConstraintTrue(testCase.eq(1L), new Long(1L));
        assertConstraintTrue(testCase.eq(1.0F), new Float(1.0F));
        assertConstraintTrue(testCase.eq(1.0), new Double(1.0));
        assertConstraintFalse(testCase.eq(true), new Boolean(false));
        assertConstraintFalse(testCase.eq(false), new Boolean(true));
        assertConstraintFalse(testCase.eq((byte) 1), new Byte((byte) 2));
        assertConstraintFalse(testCase.eq((short) 1), new Short((short) 2));
        assertConstraintFalse(testCase.eq('a'), new Character('b'));
        assertConstraintFalse(testCase.eq(1), new Integer(2));
        assertConstraintFalse(testCase.eq(1L), new Long(2L));
        assertConstraintFalse(testCase.eq(1.0F), new Float(2.0F));
        assertConstraintFalse(testCase.eq(1.0), new Double(2.0));
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
