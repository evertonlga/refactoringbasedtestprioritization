package byTestCase.output;

import org.jmock.expectation.ExpectationList;

public class ExpectationListTest_1 extends AbstractTestExpectationCollection {

    protected void setUp() throws Exception {
        super.setUp();
        myExpectation = new ExpectationList(getClass().getName());
    }

    public void testSorted() {
        myExpectation.addExpected("A");
        myExpectation.addExpected("B");
        myExpectation.addActual("A");
        myExpectation.addActual("B");
        myExpectation.verify();
    }
}
