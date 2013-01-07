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

public class MockObjectSupportTestCaseTest_10 extends TestCase {

    private static final String DUMMY_NAME = "DUMMY NAME";

    Constraint trueConstraint = new IsAnything("always true");

    Constraint falseConstraint = new IsNothing("always false");

    MockObjectSupportTestCase testCase;

    public void setUp() {
        testCase = new MockObjectSupportTestCase() {
        };
    }

    public void testConvenienceMethodForCreatingArrayContainingConstraintsIsOverloadedForPrimitiveTypes() {
        assertConstraintTrue(testCase.arrayContaining("a"), new String[] { "a" });
        assertConstraintTrue(testCase.arrayContaining(true), new boolean[] { true });
        assertConstraintTrue(testCase.arrayContaining(false), new boolean[] { false });
        assertConstraintTrue(testCase.arrayContaining((byte) 1), new byte[] { (byte) 1 });
        assertConstraintTrue(testCase.arrayContaining((short) 1), new short[] { (short) 1 });
        assertConstraintTrue(testCase.arrayContaining('a'), new char[] { 'a' });
        assertConstraintTrue(testCase.arrayContaining(1), new int[] { 1 });
        assertConstraintTrue(testCase.arrayContaining(1L), new long[] { 1L });
        assertConstraintTrue(testCase.arrayContaining(1.0F), new float[] { 1.0F });
        assertConstraintTrue(testCase.arrayContaining(1.0), new double[] { 1.0 });
        assertConstraintFalse(testCase.arrayContaining("a"), new String[] { "b" });
        assertConstraintFalse(testCase.arrayContaining(true), new boolean[] { false });
        assertConstraintFalse(testCase.arrayContaining(false), new boolean[] { true });
        assertConstraintFalse(testCase.arrayContaining((byte) 1), new byte[] { (byte) 2 });
        assertConstraintFalse(testCase.arrayContaining((short) 1), new short[] { (short) 2 });
        assertConstraintFalse(testCase.arrayContaining('a'), new char[] { 'b' });
        assertConstraintFalse(testCase.arrayContaining(1), new int[] { 2 });
        assertConstraintFalse(testCase.arrayContaining(1L), new long[] { 2L });
        assertConstraintFalse(testCase.arrayContaining(1.0F), new float[] { 2.0F });
        assertConstraintFalse(testCase.arrayContaining(1.0), new double[] { 2.0 });
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
