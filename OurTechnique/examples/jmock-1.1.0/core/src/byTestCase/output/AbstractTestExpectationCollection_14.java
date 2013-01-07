package byTestCase.output;

import java.util.Vector;

import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationCollection;
import org.jmock.expectation.ExpectationList;

import junit.framework.TestCase;

public class AbstractTestExpectationCollection_14 extends TestCase{

	ExpectationCollection myExpectation;
	
	 protected void setUp() throws Exception {
	        super.setUp();
	        myExpectation = new ExpectationList(getClass().getName());
	    }
	
	public void testMultiFailureFromIterator() {
      Vector expectedItems = new Vector();
      expectedItems.addElement("A");
      expectedItems.addElement("B");

      Vector actualItems = new Vector();
      actualItems.addElement("A");
      actualItems.addElement("C");

      myExpectation.addExpectedMany(expectedItems.iterator());
      myExpectation.setFailOnVerify();

      myExpectation.addActualMany(actualItems.iterator());

      AssertMo.assertVerifyFails(myExpectation);
  }
}
