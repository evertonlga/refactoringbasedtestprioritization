package byTestCase.output;

import java.util.Vector;

import org.jmock.expectation.ExpectationCollection;
import org.jmock.expectation.ExpectationList;

import junit.framework.TestCase;

public class AbstractTestExpectationCollection_9 extends TestCase{
	ExpectationCollection myExpectation;
	
	 protected void setUp() throws Exception {
	        super.setUp();
	        myExpectation = new ExpectationList(getClass().getName());
	    }
	
	public void testHasExpectationsForAddingManyVector() {
      assertTrue("Should not have any expectations",
                 !myExpectation.hasExpectations());

      myExpectation.addExpectedMany(new Vector().elements());

      assertTrue("Should have an expectation", myExpectation.hasExpectations());
  }
}
