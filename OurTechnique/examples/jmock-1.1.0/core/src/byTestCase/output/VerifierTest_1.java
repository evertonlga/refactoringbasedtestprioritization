package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.ExpectationValue;
import org.jmock.expectation.MockObject;

public class VerifierTest_1 extends TestCase {

    public void testInheritVerifiableFails() {
        InheritVerifiable inheritVerifiable = new InheritVerifiable();
        inheritVerifiable.setValue("bad");
        boolean hasThrownException = false;
        try {
            inheritVerifiable.verify();
        } catch (AssertionFailedError ex) {
            hasThrownException = true;
        }
        assertTrue("Should have thrown exception", hasThrownException);
    }

    class OneVerifiable extends MockObject {

        private ExpectationValue myValue = new ExpectationValue("should fail");

        private int unusedField = 0;

        public OneVerifiable() {
            myValue.setFailOnVerify();
            myValue.setExpected("good");
            unusedField = unusedField + 1;
        }

        public void setValue(String aValue) {
            myValue.setActual(aValue);
        }
    }

    class InheritVerifiable extends OneVerifiable {
    }

    class LoopingVerifiable extends MockObject {

        LoopingVerifiable myRef = this;

        boolean inVerify = false;

        LoopingVerifiable() {
            super();
        }

        public void setRef(LoopingVerifiable aRef) {
            myRef = aRef;
        }

        public void verify() {
            assertTrue("Looping verification detected", !inVerify);
            inVerify = true;
            super.verify();
            inVerify = false;
        }
    }
}
