package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.ExpectationValue;
import org.jmock.expectation.MockObject;

public class VerifierTest_3 extends TestCase {

    public void testNoVerifiables() {
        class NoVerifiables extends MockObject {
        }
        new NoVerifiables().verify();
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
