package byTestCase.output;

import junit.framework.TestCase;

import org.jmock.expectation.ExpectationCollection;
import org.jmock.expectation.ExpectationList;

public class AbstractTestExpectationCollection_1 extends TestCase{

	ExpectationCollection myExpectation;
	
	 protected void setUp() throws Exception {
	        super.setUp();
	        myExpectation = new ExpectationList(getClass().getName());
	    }

   public void testEmpty() {
       myExpectation.verify();
   }
}
