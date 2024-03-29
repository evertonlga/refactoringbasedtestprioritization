package core.tests;
/*  Copyright (c) 2000-2004 jMock.org
 */


import junit.framework.TestCase;
import org.jmock.util.Dummy;
import org.jmock.util.NotImplementedException;


public class DummyTest extends TestCase
{
    private static final String DUMMY_NAME = "DUMMY NAME";

    interface ExampleInterface
    {
        void method1();
    }

    public void testCanCreateDummyObjectsThatReturnANameFromString() {
        Object dummy = Dummy.newDummy(DUMMY_NAME);

        assertEquals("should return name from toString",
                     DUMMY_NAME, dummy.toString());
    }

    public void testImplementsAGivenInterface() {
        Object dummy = Dummy.newDummy(ExampleInterface.class);

        assertTrue("should be instanceof ExampleInterface",
                   dummy instanceof ExampleInterface);
    }

    public void testCanBeGivenAnExplicitNameThatIsReturnedByToString() {
        Object dummy = Dummy.newDummy(ExampleInterface.class, DUMMY_NAME);

        assertEquals("should return name from toString",
                     DUMMY_NAME, dummy.toString());
    }

    public void testGetsAUsefulDefaultName() {
        Object dummy = Dummy.newDummy(ExampleInterface.class);

        assertEquals("should return name from toString",
                     "dummyExampleInterface", dummy.toString());
    }

    public void testImplementsEqualsByComparingObjectReferences() {
        Object dummy = Dummy.newDummy(ExampleInterface.class);

        assertTrue("should be equal to itself", dummy.equals(dummy));
        assertFalse("should not be equal to another object", dummy.equals(new Object()));
    }

    public void testThrowsNotImplementedExceptionFromEveryMethod() {
        ExampleInterface dummy =
                (ExampleInterface)Dummy.newDummy(ExampleInterface.class, DUMMY_NAME);

        try {
            dummy.method1();
            fail("NotImplementedException expected from method1");
        }
        catch (NotImplementedException ex) {
            assertTrue("error message should contain name of dummy object",
                       ex.getMessage().indexOf(DUMMY_NAME) >= 0);
            assertTrue("error message should contain name of invokedMethod",
                       ex.getMessage().indexOf("method1") >= 0);
        }
    }
}
