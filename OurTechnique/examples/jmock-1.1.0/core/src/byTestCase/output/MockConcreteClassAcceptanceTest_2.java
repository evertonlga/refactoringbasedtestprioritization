package byTestCase.output;

import java.util.ArrayList;
import org.jmock.Mock;
import org.jmock.cglib.MockObjectTestCase;
import org.jmock.util.NotImplementedException;

public class MockConcreteClassAcceptanceTest_2 extends MockObjectTestCase {

    public void testCanMockConcreteClassesWithConstructorArguments() throws Exception {
        Mock mock = mock(ClassWithConstructorArguments.class, new Class[] { int.class, String.class }, new Object[] { new Integer(1), "" });
        mock.expects(once()).method("mockedMethod").withNoArguments().will(returnValue("result"));
        assertEquals("result", ((ClassWithConstructorArguments) mock.proxy()).mockedMethod());
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
