package byTestCase.output;

import org.jmock.expectation.ExpectationCollection;
import org.jmock.expectation.ExpectationList;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

public class AbstractTestExpectationCollection_3 extends TestCase {

	ExpectationCollection myExpectation;
	
	 protected void setUp() throws Exception {
	        super.setUp();
	        myExpectation = new ExpectationList(getClass().getName());
	    }
	 
	 public void testFailImmediatelyAddingTooMany() {
       myExpectation.addExpected("A");

       myExpectation.addActual("A");
       try {
           myExpectation.addActual("C");
       }
       catch (AssertionFailedError ex) {
           return;
       }
       fail("Should have failed immediately");
   }
}
