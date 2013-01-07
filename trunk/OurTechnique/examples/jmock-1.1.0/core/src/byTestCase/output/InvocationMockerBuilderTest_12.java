package byTestCase.output;

import junit.framework.AssertionFailedError;
import org.jmock.builder.InvocationMockerBuilder;
import org.jmock.core.Constraint;
import org.jmock.core.InvocationMatcher;
import org.jmock.core.MockObjectSupportTestCase;
import org.jmock.core.Stub;
import org.jmock.core.matcher.AnyArgumentsMatcher;
import org.jmock.core.matcher.ArgumentsMatcher;
import org.jmock.core.matcher.MethodNameMatcher;
import org.jmock.core.matcher.NoArgumentsMatcher;
import org.jmock.core.stub.VoidStub;
import org.jmock.expectation.AssertMo;
import org.jmock.util.Dummy;
import test.jmock.builder.testsupport.MockBuilderIdentityTable;
import test.jmock.builder.testsupport.MockStubMatchersCollection;

public class InvocationMockerBuilderTest_12 extends MockObjectSupportTestCase {

    private MockStubMatchersCollection mocker;

    private MockBuilderIdentityTable idTable;

    private InvocationMockerBuilder builder;

    static final String INVOCATION_ID = "INVOCATION-ID";

    public void setUp() {
        mocker = new MockStubMatchersCollection();
        idTable = new MockBuilderIdentityTable();
        builder = new InvocationMockerBuilder(mocker, idTable, MockedInterface.class);
    }

    public void testCanSetCustomStub() {
        Stub stub = (Stub) Dummy.newDummy(Stub.class, "stub");
        mocker.setStub.setExpected(stub);
        assertNotNull("should be expectation builder", builder.will(stub));
    }

    public interface MockedInterface {

        void method();
    }
}
