package byTestCase.output;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

import org.jmock.expectation.ExpectationCollection;
import org.jmock.expectation.ExpectationList;

public class AbstractTestExpectationCollection_2 extends TestCase{

	ExpectationCollection myExpectation;
	
	 protected void setUp() throws Exception {
	        super.setUp();
	        myExpectation = new ExpectationList(getClass().getName());
	    }
	 
	 public void testFailImmediately() {
       myExpectation.addExpected("A");
       myExpectation.addExpected("B");

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

