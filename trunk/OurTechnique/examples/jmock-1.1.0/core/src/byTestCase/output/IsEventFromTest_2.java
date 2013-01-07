package byTestCase.output;

import java.util.EventObject;
import org.jmock.core.constraint.IsEventFrom;

public class IsEventFromTest_2 extends AbstractConstraintsTest {

    public void testCanTestForSpecificEventClasses() {
        Object o = new Object();
        DerivedEvent good_ev = new DerivedEvent(o);
        DerivedEvent wrong_source = new DerivedEvent(new Object());
        EventObject wrong_type = new EventObject(o);
        EventObject wrong_source_and_type = new EventObject(new Object());
        IsEventFrom p = new IsEventFrom(DerivedEvent.class, o);
        assertTrue(p.eval(good_ev));
        assertTrue("p should eval to false for an event not from o", !p.eval(wrong_source));
        assertTrue("p should eval to false for an event of the wrong type", !p.eval(wrong_type));
        assertTrue("p should eval to false for an event of the wrong type " + "and from the wrong source", !p.eval(wrong_source_and_type));
    }

    private static class DerivedEvent extends EventObject {

        private static final long serialVersionUID = 1L;

        public DerivedEvent(Object source) {
            super(source);
        }
    }
}
