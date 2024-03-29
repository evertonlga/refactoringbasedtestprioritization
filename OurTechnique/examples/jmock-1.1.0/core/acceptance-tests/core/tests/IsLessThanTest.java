package core.tests;
/*  Copyright (c) 2000-2004 jMock.org
 */


import org.jmock.core.constraint.IsLessThan;


public class IsLessThanTest extends AbstractConstraintsTest
{
    public void testEvaluatesToTrueIfArgumentIsLessThanAComparableObject() {
        IsLessThan c = new IsLessThan(new Integer(1));

        assertTrue(c.eval(new Integer(0)));
        assertFalse(c.eval(new Integer(1)));
        assertFalse(c.eval(new Integer(2)));
    }
}
