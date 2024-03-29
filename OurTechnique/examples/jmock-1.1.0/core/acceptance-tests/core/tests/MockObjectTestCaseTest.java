package core.tests;
/*  Copyright (c) 2000-2004 jMock.org
 */


import junit.framework.TestCase;
import org.jmock.MockObjectTestCase;
import org.jmock.core.Verifiable;
import org.jmock.expectation.ExpectationList;


public class MockObjectTestCaseTest extends TestCase
{

    class SampleMockObjectTestCase extends MockObjectTestCase
    {
        public void registerToVerify( Verifiable verifiable ) {
            requiresVerification.addActual(verifiable.toString());
        }

        public void testMethod() {
            // passes
        }
    }

    interface ExampleInterface
    {
        void expectedMethod();
    }

    private SampleMockObjectTestCase testCase;
    ExpectationList requiresVerification;

    public void setUp() {
        requiresVerification = new ExpectationList("registerToVerify #arguments");
        testCase = new SampleMockObjectTestCase()
        {
        };
    }

    public void testCanBeConstructedWithAName() {
        String name = "NAME";

        MockObjectTestCase namedTestCase = new MockObjectTestCase(name)
        {
        };

        assertEquals("name", name, namedTestCase.getName());
    }

    public void testRegistersAllMocksItCreatesForVerification() throws Throwable {
        // setup
        String roleName = "ROLE-NAME";

        // expect
        requiresVerification.addExpected(roleName);

        // execute
        testCase.mock(ExampleInterface.class, roleName);
        testCase.verify();

        // verify
        requiresVerification.verify();
    }
}
