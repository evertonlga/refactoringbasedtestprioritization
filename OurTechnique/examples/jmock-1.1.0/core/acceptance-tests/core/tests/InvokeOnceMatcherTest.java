package core.tests;
/*  Copyright (c) 2000-2004 jMock.org
 */


import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.jmock.core.Invocation;
import org.jmock.core.matcher.InvokeOnceMatcher;
import org.jmock.expectation.AssertMo;
import test.jmock.core.testsupport.MethodFactory;


public class InvokeOnceMatcherTest extends TestCase
{
    private Invocation emptyInvocation;
    private InvokeOnceMatcher matcher;

    public void setUp() {
        MethodFactory methodFactory = new MethodFactory();
        emptyInvocation = new Invocation("INVOKED-OBJECT",
                                         methodFactory.newMethod("example", MethodFactory.NO_ARGUMENTS, Void.class, MethodFactory.NO_EXCEPTIONS),
                                         new Object[0]);
        matcher = new InvokeOnceMatcher();
    }

    public void testWillMatchIfNotYetInvoked() {
        assertTrue("Should match", matcher.matches(emptyInvocation));
    }

    public void testVerifyFailsIfNotYetInvoked() {
        try {
            matcher.verify();
        }
        catch (AssertionFailedError ex) {
            AssertMo.assertIncludes("should report expected method not invoked",
                                    "expected method was not invoked", ex.getMessage());
            return;
        }
        fail("Should have thrown exception");
    }

    public void testWillNotMatchAfterInvocation() {
        matcher.invoked(emptyInvocation);
        assertFalse("Should not match", matcher.matches(emptyInvocation));
    }

    public void testVerifyPassesAfterInvocation() {
        matcher.invoked(emptyInvocation);
        matcher.verify();
    }

    private static final String MATCH_DESCRIPTION = "expected once";

    public void testWritesDescriptionOfMatch() {
        String description = matcher.describeTo(new StringBuffer()).toString();

        assertTrue("should have description", matcher.hasDescription());
        assertEquals("should describe match", MATCH_DESCRIPTION, description);
    }

    public void testReportsWhetherCalledInDescription() {
        matcher.invoked(emptyInvocation);

        String description = matcher.describeTo(new StringBuffer()).toString();

        assertTrue("should have description", matcher.hasDescription());
        assertTrue("should describe match",
                   description.indexOf(MATCH_DESCRIPTION) >= 0);
        assertTrue("should report has been called",
                   description.indexOf("has been invoked") >= 0);
    }
}
