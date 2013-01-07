package byTestCase.output;

import org.jmock.Mock;
import org.jmock.MockObjectTestCase;

public class ReturnTypeAcceptanceTest_10 extends MockObjectTestCase {

    private Mock mock;

    private ReturnTypes proxy;

    public void setUp() {
        mock = mock(ReturnTypes.class, "theMock");
        proxy = (ReturnTypes) mock.proxy();
    }

    public void testCanReturnDoubleValues() {
        double result = 1234567890.1234567890;
        mock.stubs().method("returnDouble").will(returnValue(result));
        assertEquals("should be same result", result, proxy.returnDouble(), 0.0);
    }

    public interface ReturnTypes {

        String returnString();

        boolean returnBoolean();

        byte returnByte();

        char returnChar();

        short returnShort();

        int returnInt();

        long returnLong();

        float returnFloat();

        double returnDouble();
    }
}
