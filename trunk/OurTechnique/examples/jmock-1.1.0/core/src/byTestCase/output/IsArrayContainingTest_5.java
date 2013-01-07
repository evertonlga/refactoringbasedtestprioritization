package byTestCase.output;

import org.jmock.core.Constraint;
import org.jmock.core.constraint.IsArrayContaining;
import org.jmock.core.constraint.IsEqual;

import core.tests.IsInTest;

public class IsArrayContainingTest_5 extends AbstractConstraintsTest {

    Constraint constraint = new IsArrayContaining(new IsEqual("a"));

    public void testMatchesPrimitiveArrayElements() {
        assertMatches("boolean", new IsArrayContaining(new IsEqual(Boolean.TRUE)), new boolean[] { true, false });
        assertDoesNotMatch("boolean", new IsArrayContaining(new IsEqual(Boolean.TRUE)), new boolean[] { false });
        assertMatches("byte", new IsArrayContaining(new IsEqual(new Byte((byte) 1))), new byte[] { 1, 2, 3 });
        assertDoesNotMatch("byte", new IsArrayContaining(new IsEqual(new Byte((byte) 0))), new byte[] { 1, 2, 3 });
        assertMatches("char", new IsArrayContaining(new IsEqual(new Character((char) 1))), new char[] { 1, 2, 3 });
        assertDoesNotMatch("char", new IsArrayContaining(new IsEqual(new Character((char) 0))), new char[] { 1, 2, 3 });
        assertMatches("short", new IsArrayContaining(new IsEqual(new Short((short) 1))), new short[] { 1, 2, 3 });
        assertDoesNotMatch("short", new IsArrayContaining(new IsEqual(new Short((short) 0))), new short[] { 1, 2, 3 });
        assertMatches("int", new IsArrayContaining(new IsEqual(new Integer(1))), new int[] { 1, 2, 3 });
        assertDoesNotMatch("int", new IsArrayContaining(new IsEqual(new Integer(0))), new int[] { 1, 2, 3 });
        assertMatches("long", new IsArrayContaining(new IsEqual(new Long(1))), new long[] { 1, 2, 3 });
        assertDoesNotMatch("long", new IsArrayContaining(new IsEqual(new Long(0))), new long[] { 1, 2, 3 });
        assertMatches("float", new IsArrayContaining(new IsEqual(new Float(1f))), new float[] { 1f, 2f, 3f });
        assertDoesNotMatch("float", new IsArrayContaining(new IsEqual(new Float(0f))), new float[] { 1f, 2f, 3f });
        assertMatches("double", new IsArrayContaining(new IsEqual(new Double(1.0))), new double[] { 1.0, 2.0, 3.0 });
        assertDoesNotMatch("double", new IsArrayContaining(new IsEqual(new Double(0.0))), new double[] { 1.0, 2.0, 3.0 });
    }
}
