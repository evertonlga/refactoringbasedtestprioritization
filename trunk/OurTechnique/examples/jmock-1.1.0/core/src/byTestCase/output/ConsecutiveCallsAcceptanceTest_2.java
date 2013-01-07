package byTestCase.output;

import org.jmock.Mock;
import org.jmock.MockObjectTestCase;
import org.jmock.core.Stub;

public class ConsecutiveCallsAcceptanceTest_2 extends MockObjectTestCase {

    public void testCanSpecifySequenceUsingArrayOfStubs() {
        Mock mock = mock(Greeter.class);
        Greeter greeter = (Greeter) mock.proxy();
        mock.expects(atLeastOnce()).method("greeting").withNoArguments().will(onConsecutiveCalls(new Stub[] { returnValue("hello"), returnValue("bonjour"), returnValue("guten Tag") }));
        assertEquals("hello", greeter.greeting());
        assertEquals("bonjour", greeter.greeting());
        assertEquals("guten Tag", greeter.greeting());
    }

    public interface Greeter {

        public String greeting();
    }
}
