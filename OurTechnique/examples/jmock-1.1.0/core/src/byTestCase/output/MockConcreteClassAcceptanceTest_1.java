package byTestCase.output;

import java.util.ArrayList;
import org.jmock.Mock;
import org.jmock.cglib.MockObjectTestCase;
import org.jmock.util.NotImplementedException;

public class MockConcreteClassAcceptanceTest_1 extends MockObjectTestCase {

    public void testCanMockConcreteClasses() throws Exception {
        Mock listMock = mock(ArrayList.class, "listMock");
        assertTrue("proxy is an ArrayList", listMock.proxy() instanceof ArrayList);
        ArrayList proxy = (ArrayList) listMock.proxy();
        Object newElement = newDummy("newElement");
        listMock.expects(once()).method("add").with(eq(newElement)).will(returnValue(true));
        proxy.add(newElement);
        listMock.verify();
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
