package core.tests;


import test.jmock.core.testsupport.MethodFactoryTest;
import atest.jmock.*;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SuiteJMock extends TestCase {
	
	public static Test suite() {
	    TestSuite   suite = new TestSuite();
	    
	    suite.addTestSuite(BadMethodNameAcceptanceTest.class);
	    suite.addTestSuite(CascadedFailuresAcceptanceTest.class);
	    suite.addTestSuite(ClassLoaderAcceptanceTest.class);
	    suite.addTestSuite(CollectionsAcceptanceTest.class);
	    suite.addTestSuite(ConsecutiveCallsAcceptanceTest.class);
	    suite.addTestSuite(DoAllAcceptanceTest.class);
	    suite.addTestSuite(DynamicMockExample.class);
	    suite.addTestSuite(ErrorMessagesAcceptanceTest.class);
	    suite.addTestSuite(ExpectNeverAcceptanceTest.class);
	    suite.addTestSuite(InvokeAtMostOnceAcceptanceTest.class);
	    suite.addTestSuite(InvokedExactCountAcceptanceTest.class);
	    suite.addTestSuite(OrderedInvocationsAcceptanceTest.class);
	    suite.addTestSuite(ReturnTypeAcceptanceTest.class);
	    
	    suite.addTestSuite(MockObjectSupportTestCaseTest.class);
	    suite.addTestSuite(MockTest.class);
	    
	    suite.addTestSuite(InvocationMockerBuilderTest.class);
	    suite.addTestSuite(InvocationMockerDescriberTest.class);
	    
//	    suite.addTestSuite(AbstractDynamicMockTest.class);
	    suite.addTestSuite(CoreMockTest.class);
	    suite.addTestSuite(FIFOInvocationDispatcherTest.class);
	    suite.addTestSuite(InvocationMockerTest.class);
	    suite.addTestSuite(InvocationTest.class);
	    suite.addTestSuite(LIFOInvocationDispatcherTest.class);
	    suite.addTestSuite(MockObjectSupportTestCaseTest.class);
	    suite.addTestSuite(VerifyingTestCaseTest.class);
	    
//	    suite.addTestSuite(AbstractConstraintsTest.class);
	    suite.addTestSuite(AndTest.class);
	    suite.addTestSuite(HasPropertyTest.class);
	    suite.addTestSuite(HasPropertyWithValueTest.class);
	    suite.addTestSuite(HasToStringTest.class);
	    suite.addTestSuite(IsAnythingTest.class);
	    suite.addTestSuite(IsArrayContainingTest.class);
	    suite.addTestSuite(IsCollectionContainingTest.class);
	    suite.addTestSuite(IsCompatibleTypeTest.class);
	    suite.addTestSuite(IsEqualTest.class);
	    suite.addTestSuite(IsEventFromTest.class);
	    suite.addTestSuite(IsGreaterThanTest.class);
	    suite.addTestSuite(IsInstanceOfTest.class);
	    suite.addTestSuite(IsInTest.class);
	    suite.addTestSuite(IsLessThanTest.class);
	    suite.addTestSuite(IsMapContainingTest.class);
	    suite.addTestSuite(IsNothingTest.class);
	    suite.addTestSuite(IsNotTest.class);
	    suite.addTestSuite(IsNullTest.class);
	    suite.addTestSuite(IsSameTest.class);
	    suite.addTestSuite(OrTest.class);
	    suite.addTestSuite(StringContainsTest.class);
	    suite.addTestSuite(StringEndsWithTest.class);
	    suite.addTestSuite(StringStartsWithTest.class);
	    
	    suite.addTestSuite(ArgumentsMatcherTest.class);
	    suite.addTestSuite(InvokeAtLeastOnceMatcherTest.class);
	    suite.addTestSuite(InvokeAtMostOnceMatcherTest.class);
	    suite.addTestSuite(InvokeCountMatcherTest.class);
	    suite.addTestSuite(InvokedAfterMatcherTest.class);
	    suite.addTestSuite(InvokedAfterMatcherTest.class);
	    suite.addTestSuite(InvokedRecorderTest.class);
	    suite.addTestSuite(InvokeOnceMatcherTest.class);
	    suite.addTestSuite(MethodNameMatcherTest.class);
	    suite.addTestSuite(TestFailureMatcherTest.class);
	    
	    suite.addTestSuite(CustomStubTest.class);
	    suite.addTestSuite(DefaultResultStubTest.class);
	    suite.addTestSuite(DoAllStubTest.class);
	    suite.addTestSuite(ReturnIteratorStubTest.class);
	    suite.addTestSuite(ReturnStubTest.class);
	    suite.addTestSuite(StubSequenceTest.class);
	    suite.addTestSuite(TestFailureStubTest.class);
	    suite.addTestSuite(ThrowStubTest.class);
	    suite.addTestSuite(VoidStubTest.class);
	    
	    suite.addTestSuite(MethodFactoryTest.class);
	    
	    suite.addTestSuite(AssertMoTest.class);
	    suite.addTestSuite(ExpectationCounterTest.class);
	    suite.addTestSuite(ExpectationDoubleValueTest.class);
	    suite.addTestSuite(ExpectationListTest.class);
	    suite.addTestSuite(ExpectationMapTest.class);
	    suite.addTestSuite(ExpectationSegmentTest.class);
	    suite.addTestSuite(ExpectationSetTest.class);
	    suite.addTestSuite(ExpectationValueTest.class);
	    suite.addTestSuite(MapEntryTest.class);
	    suite.addTestSuite(NullTest.class);
	    suite.addTestSuite(ReturnObjectBagTest.class);
	    suite.addTestSuite(ReturnObjectListTest.class);
	    suite.addTestSuite(ReturnObjectMapTest.class);
	    suite.addTestSuite(ReturnValueTest.class);
	    
	    suite.addTestSuite(DummyTest.class);
	    suite.addTestSuite(VerifierTest.class);
	    
	    suite.addTestSuite(ErrorMessagesAcceptanceTest.class);
	    suite.addTestSuite(MockConcreteClassAcceptanceTest.class);
	    
	    suite.addTestSuite(CGLIBCoreMockTest.class);
	    suite.addTestSuite(CGLIBMockObjectTestCaseTest.class);
	    

	    return suite;
	  }

}
