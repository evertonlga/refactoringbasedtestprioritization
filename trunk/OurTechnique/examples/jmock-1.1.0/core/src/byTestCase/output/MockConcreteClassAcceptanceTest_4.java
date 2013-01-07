package byTestCase.output;

import java.util.ArrayList;
import org.jmock.Mock;
import org.jmock.cglib.MockObjectTestCase;
import org.jmock.util.NotImplementedException;

public class MockConcreteClassAcceptanceTest_4 extends MockObjectTestCase {

    public void testCanMockClassesWithComplexConstructors() throws Exception {
        String mockName = "MOCK_NAME";
        Mock mock = mock(ClassWithComplexConstructor.class, mockName);
        mock.expects(once()).method("mockedMethod").withNoArguments().will(returnValue("result"));
        assertEquals("mocked result", "result", ((ClassWithComplexConstructor) mock.proxy()).mockedMethod());
        assertEquals("original result", "ORIGINAL_RESULT", ((ClassWithComplexConstructor) mock.proxy()).resultOfMockedMethodCalledInConstructor);
        mock.verify();
    }

    public static class ClassWithConstructorArguments {

        public ClassWithConstructorArguments(int arg1, String arg2) {
        }

        public String mockedMethod() {
            throw new NotImplementedException("not implemented");
        }
    }

    public static class ClassWithComplexConstructor {

        public String resultOfMockedMethodCalledInConstructor;

        public ClassWithComplexConstructor() {
            resultOfMockedMethodCalledInConstructor = mockedMethod();
        }

        public String mockedMethod() {
            return "ORIGINAL_RESULT";
        }
    }
}
