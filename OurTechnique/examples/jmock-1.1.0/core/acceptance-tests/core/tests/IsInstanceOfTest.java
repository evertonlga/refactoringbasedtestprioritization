package core.tests;
/*  Copyright (c) 2000-2004 jMock.org
 */


import org.jmock.core.constraint.IsInstanceOf;


public class IsInstanceOfTest extends AbstractConstraintsTest
{
    public void testEvaluatesToTrueIfArgumentIsInstanceOfASpecificClass() {
        IsInstanceOf isInstanceOf = new IsInstanceOf(Number.class);

        assertTrue(isInstanceOf.eval(new Integer(1)));
        assertTrue(isInstanceOf.eval(new Double(1.0)));
        assertFalse(isInstanceOf.eval("a string"));
        assertFalse(isInstanceOf.eval(null));
    }
}
