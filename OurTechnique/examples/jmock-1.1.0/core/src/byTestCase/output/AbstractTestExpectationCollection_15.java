package byTestCase.output;

import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationCollection;
import org.jmock.expectation.ExpectationList;

import junit.framework.TestCase;

public class AbstractTestExpectationCollection_15 extends TestCase{

	ExpectationCollection myExpectation;
	
	 protected void setUp() throws Exception {
	        super.setUp();
	        myExpectation = new ExpectationList(getClass().getName());
	    }
	
	public void testMultiFailureSizes() {
      myExpectation.addExpectedMany(new String[]{"A", "B"});
      myExpectation.setFailOnVerify();

      myExpectation.addActualMany(new String[]{"A", "B", "C"});

      AssertMo.assertVerifyFails(myExpectation);
  }
}
