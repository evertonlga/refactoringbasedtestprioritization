package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

import org.jmock.expectation.ExpectationCollection;
import org.jmock.expectation.ExpectationList;

public class AbstractTestExpectationCollection_4 extends TestCase{

	ExpectationCollection myExpectation;
	
	 protected void setUp() throws Exception {
	        super.setUp();
	        myExpectation = new ExpectationList(getClass().getName());
	    }
	
	public void testFailOnSizes() {
      myExpectation.addExpected("A");
      myExpectation.addExpected("B");

      myExpectation.addActual("A");
      myExpectation.addActual("B");

      try {
          myExpectation.addActual("C");
      }
      catch (AssertionFailedError ex) {
          return;
      }
      fail("Should have failed immediately");
  }
}
