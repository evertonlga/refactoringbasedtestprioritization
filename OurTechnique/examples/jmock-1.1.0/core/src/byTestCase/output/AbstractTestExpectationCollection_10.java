package byTestCase.output;

import org.jmock.expectation.ExpectationCollection;
import org.jmock.expectation.ExpectationList;

import junit.framework.TestCase;

public class AbstractTestExpectationCollection_10 extends TestCase{

	ExpectationCollection myExpectation;
	
	 protected void setUp() throws Exception {
	        super.setUp();
	        myExpectation = new ExpectationList(getClass().getName());
	    }
	public void testHasNoExpectations() {

		myExpectation.addActual("a value");
		assertTrue("Has no expectations", !myExpectation.hasExpectations());
	}
}
