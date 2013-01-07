package byTestCase.output;

import java.util.Vector;

import org.jmock.expectation.ExpectationCollection;
import org.jmock.expectation.ExpectationList;

import junit.framework.TestCase;

public class AbstractTestExpectationCollection_11 extends TestCase{

	ExpectationCollection myExpectation;
	
	 protected void setUp() throws Exception {
	        super.setUp();
	        myExpectation = new ExpectationList(getClass().getName());
	    }
	 
	public void testManyFromIterator() {
      Vector expectedItems = new Vector();
      expectedItems.addElement("A");
      expectedItems.addElement("B");

      Vector actualItems = (Vector)expectedItems.clone();

      myExpectation.addExpectedMany(expectedItems.iterator());

      myExpectation.addActualMany(actualItems.iterator());

      myExpectation.verify();
  }
}
