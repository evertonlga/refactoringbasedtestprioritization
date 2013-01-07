package byTestCase.output;

import org.jmock.expectation.ExpectationCollection;
import org.jmock.expectation.ExpectationList;

import junit.framework.TestCase;

public class AbstractTestExpectationCollection_7 extends TestCase{

	ExpectationCollection myExpectation;
	
	 protected void setUp() throws Exception {
	        super.setUp();
	        myExpectation = new ExpectationList(getClass().getName());
	    }
	
	public void testHasExpectations() {
      assertTrue("Should not have any expectations",
                 !myExpectation.hasExpectations());

      myExpectation.addExpected("item");

      assertTrue("Should have an expectation", myExpectation.hasExpectations());
  }
}
