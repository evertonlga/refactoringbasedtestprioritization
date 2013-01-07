package byTestCase.output;

import java.util.EventObject;
import org.jmock.core.constraint.IsEventFrom;

public class IsEventFromTest_1 extends AbstractConstraintsTest {

    public void testEvaluatesToTrueIfArgumentIsAnEventObjectFiredByASpecifiedSource() {
        Object o = new Object();
        EventObject ev = new EventObject(o);
        EventObject ev2 = new EventObject(new Object());
        IsEventFrom p = new IsEventFrom(o);
        assertTrue(p.eval(ev));
        assertTrue("p should eval to false for an event not from o", !p.eval(ev2));
        assertTrue("p should eval to false for objects that are not events", !p.eval(o));
    }

    private static class DerivedEvent extends EventObject {

        private static final long serialVersionUID = 1L;

        public DerivedEvent(Object source) {
            super(source);
        }
    }
}
