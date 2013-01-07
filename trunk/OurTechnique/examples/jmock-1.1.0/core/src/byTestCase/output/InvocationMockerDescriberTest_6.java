package byTestCase.output;

import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;
import org.jmock.builder.InvocationMockerDescriber;
import org.jmock.core.Constraint;
import org.jmock.core.matcher.ArgumentsMatcher;
import org.jmock.core.matcher.MethodNameMatcher;
import org.jmock.util.Verifier;
import test.jmock.core.testsupport.MockConstraint;
import test.jmock.core.testsupport.MockInvocationMatcher;
import test.jmock.core.testsupport.MockStub;

public class InvocationMockerDescriberTest_6 extends TestCase {

    static final String METHOD_NAME = "METHOD-NAME";

    InvocationMockerDescriber describer;

    List matchers;

    MethodNameMatcher methodNameMatcher;

    Constraint arg1;

    Constraint arg2;

    ArgumentsMatcher argumentsMatcher;

    MockInvocationMatcher expectation;

    MockStub stub;

    String name;

    StringBuffer buffer;

    public void setUp() {
        describer = new InvocationMockerDescriber();
        methodNameMatcher = new MethodNameMatcher(METHOD_NAME);
        arg1 = new MockConstraint("ARG1");
        arg2 = new MockConstraint("ARG2");
        argumentsMatcher = new ArgumentsMatcher(new Constraint[] { arg1, arg2 });
        matchers = new ArrayList();
        expectation = new MockInvocationMatcher();
        expectation.describeToOutput = "EXPECTATION";
        stub = new MockStub();
        stub.describeToOutput = "STUB";
        name = null;
        buffer = new StringBuffer();
    }

    public void testAddsSeparatorAfterMethodNameIfNoArgumentsMatcher() {
        MockInvocationMatcher otherMatcher = new MockInvocationMatcher();
        otherMatcher.describeToOutput = "OTHER-MATCHER";
        matchers.add(expectation);
        matchers.add(methodNameMatcher);
        matchers.add(otherMatcher);
        describer.describeTo(buffer, matchers, stub, name);
        assertEquals("EXPECTATION: METHOD-NAME, OTHER-MATCHER, STUB", buffer.toString());
        Verifier.verifyObject(this);
    }
}
