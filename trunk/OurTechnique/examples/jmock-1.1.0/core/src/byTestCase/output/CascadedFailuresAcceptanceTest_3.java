package byTestCase.output;

import org.jmock.MockObjectTestCase;
import org.jmock.Mock;
import org.jmock.core.DynamicMockError;

public class CascadedFailuresAcceptanceTest_3 extends MockObjectTestCase {

    private static final int VALID_ARGUMENT = 2;

    private static final int INVALID_ARGUMENT = 1;

    private Mock mock;

    private ObjectUnderTest objectUnderTest;

    public void setUp() {
        mock = mock(MockedType.class, "mock");
        objectUnderTest = new ObjectUnderTest((MockedType) mock.proxy());
        mock.stubs().method("f").with(eq(VALID_ARGUMENT));
    }

    public void testSuccessfulVerifyClearsFirstFailure() {
        try {
            objectUnderTest.methodUnderTest(INVALID_ARGUMENT);
            fail("should have thrown DynamicMockError");
        } catch (DynamicMockError err) {
        }
        mock.verify();
        try {
            objectUnderTest.methodUnderTest(VALID_ARGUMENT);
            fail("should have thrown DynamicMockError");
        } catch (DynamicMockError err) {
            assertEquals("invoked method", "g", err.invocation.invokedMethod.getName());
        }
    }

    public interface MockedType {

        void f(int i);

        void g();
    }

    public static class ObjectUnderTest {

        private MockedType other;

        public ObjectUnderTest(MockedType other) {
            this.other = other;
        }

        public void methodUnderTest(int i) {
            try {
                other.f(i);
            } finally {
                other.g();
            }
        }
    }
}
