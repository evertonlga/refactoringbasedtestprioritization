package core.tests;
/*  Copyright (c) 2000-2004 jMock.org
 */


import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.expectation.AssertMo;
import org.jmock.expectation.ExpectationCounter;


public class ExpectationCounterTest extends TestCase
{

    public void testExpectNothing() {
        ExpectationCounter e = new ExpectationCounter("");
        e.setExpectNothing();

        assertTrue("Has expectation", e.hasExpectations());
        e.verify();
    }

    public void testExpectNothingFailure() {
        ExpectationCounter e = new ExpectationCounter("");
        e.setExpectNothing();

        assertTrue("Has expectation", e.hasExpectations());
        try {
            e.inc();
        }
        catch (AssertionFailedError ex) {
            return;
        }
        fail("Should have failed immediately");
    }

    public void testFailImmediately() {
        ExpectationCounter aCounter = new ExpectationCounter("a test counter");
        aCounter.setExpected(1);

        aCounter.inc();
        try {
            aCounter.inc();
        }
        catch (AssertionFailedError ex) {
            return;
        }
        fail("Should have failed immediately");
    }

    public void testFailOnVerify() {
        ExpectationCounter aCounter = new ExpectationCounter("a test counter");
        aCounter.setExpected(1);
        aCounter.setFailOnVerify();

        aCounter.inc();
        aCounter.inc();

        AssertMo.assertVerifyFails(aCounter);
    }

    public void testFailure() {
        ExpectationCounter e = new ExpectationCounter("");
        e.setExpected(1);

        AssertMo.assertVerifyFails(e);
    }

    public void testFlushActual() {
        ExpectationCounter e = new ExpectationCounter("");
        e.inc();

        e.setExpected(1);
        e.inc();

        e.verify();
    }

    public void testHasNoExpectations() {
        ExpectationCounter aCounter = new ExpectationCounter("a test counter");

        aCounter.inc();
        assertTrue("Has no expectations", !aCounter.hasExpectations());
    }

    public void testSuccess() {
        ExpectationCounter e = new ExpectationCounter("");
        e.setExpected(1);
        e.inc();

        e.verify();
    }
}
