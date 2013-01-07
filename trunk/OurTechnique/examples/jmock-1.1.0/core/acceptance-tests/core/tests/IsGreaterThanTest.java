package core.tests;
/*  Copyright (c) 2000-2004 jMock.org
 */


import org.jmock.core.constraint.IsGreaterThan;


public class IsGreaterThanTest extends AbstractConstraintsTest
{
    public void testEvaluatesToTrueIfArgumentIsGreaterThanAComparableObject() {
        IsGreaterThan c = new IsGreaterThan(new Integer(1));

        assertFalse(c.eval(new Integer(0)));
        assertFalse(c.eval(new Integer(1)));
        assertTrue(c.eval(new Integer(2)));
    }
}
