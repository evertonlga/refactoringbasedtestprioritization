package core.tests;
/*  Copyright (c) 2000-2004 jMock.org
 */


import org.jmock.core.constraint.IsNull;


public class IsNullTest extends AbstractConstraintsTest
{
    public void testEvaluatesToTrueIfArgumentIsNull() {
        IsNull isNull = new IsNull();

        assertTrue(isNull.eval(null));
        assertFalse(isNull.eval(ANY_NON_NULL_ARGUMENT));
    }
}
