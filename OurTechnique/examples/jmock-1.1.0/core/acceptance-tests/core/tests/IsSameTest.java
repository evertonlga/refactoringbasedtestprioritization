package core.tests;
/*  Copyright (c) 2000-2004 jMock.org
 */


import org.jmock.core.constraint.IsSame;


public class IsSameTest extends AbstractConstraintsTest
{
    public void testEvaluatesToTrueIfArgumentIsReferenceToASpecifiedObject() {
        Object o1 = new Object();
        Object o2 = new Object();

        IsSame isSame = new IsSame(o1);

        assertTrue(isSame.eval(o1));
        assertFalse(isSame.eval(o2));
    }

    public void testReturnsReadableDescriptionFromToString() {
        IsSame isSame = new IsSame("ARG");
        assertEquals("description", "same(\"ARG\")",
                     isSame.describeTo(new StringBuffer()).toString());
    }

    public void testReturnsReadableDescriptionFromToStringWhenInitialisedWithNull() {
        IsSame isSame = new IsSame(null);
        assertEquals("description", "same(null)",
                     isSame.describeTo(new StringBuffer()).toString());
    }
}
