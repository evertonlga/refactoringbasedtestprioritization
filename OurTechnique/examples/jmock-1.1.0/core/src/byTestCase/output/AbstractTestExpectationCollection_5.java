package byTestCase.output;

import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationCollection;
import org.jmock.expectation.ExpectationList;

import junit.framework.TestCase;

public class AbstractTestExpectationCollection_5 extends TestCase{

	ExpectationCollection myExpectation;
	
	 protected void setUp() throws Exception {
	        super.setUp();
	        myExpectation = new ExpectationList(getClass().getName());
	    }
	public void testFailOnVerify() {
		myExpectation.setFailOnVerify();
      myExpectation.addExpectedMany(new String[]{"A", "B"});

      myExpectation.addActualMany(new String[]{"C", "A"});

      AssertMo.assertVerifyFails(myExpectation);
  }
}
