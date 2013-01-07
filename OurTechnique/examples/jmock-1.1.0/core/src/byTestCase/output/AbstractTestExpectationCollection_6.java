package byTestCase.output;

import org.jmock.expectation.ExpectationCollection;
import org.jmock.expectation.ExpectationList;

import junit.framework.TestCase;

public class AbstractTestExpectationCollection_6 extends TestCase{

	ExpectationCollection myExpectation;
	
	 protected void setUp() throws Exception {
	        super.setUp();
	        myExpectation = new ExpectationList(getClass().getName());
	    }
	
	public void testFlushActual() {

		myExpectation.addActual("a value");

		myExpectation.setExpectNothing();
		myExpectation.verify();
	}
}
