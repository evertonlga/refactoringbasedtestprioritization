package byTestCase.output;

import org.jmock.expectation.ExpectationCollection;
import org.jmock.expectation.ExpectationList;

import junit.framework.TestCase;

public class AbstractTestExpectationCollection_16 extends TestCase{

	ExpectationCollection myExpectation;
	
	 protected void setUp() throws Exception {
	        super.setUp();
	        myExpectation = new ExpectationList(getClass().getName());
	    }
	
	public void testExpectingALong() {
      final long expectedLong = 666l;

      myExpectation.addExpected(expectedLong);
      myExpectation.addActual(expectedLong);

      myExpectation.verify();
  }
}
