package byTestCase.output;

import org.jmock.Mock;
import org.jmock.MockObjectTestCase;

public class ReturnTypeAcceptanceTest_9 extends MockObjectTestCase {

    private Mock mock;

    private ReturnTypes proxy;

    public void setUp() {
        mock = mock(ReturnTypes.class, "theMock");
        proxy = (ReturnTypes) mock.proxy();
    }

    public void testCanReturnFloatValues() {
        float result = 12345.67890f;
        mock.stubs().method("returnFloat").will(returnValue(result));
        assertEquals("should be same result", result, proxy.returnFloat(), 0.0);
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
