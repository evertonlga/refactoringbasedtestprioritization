package byTestCase.output;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jmock.Mock;
import org.jmock.MockObjectTestCase;
import org.jmock.core.DynamicMockError;

public class CollectionsAcceptanceTest_2 extends MockObjectTestCase {

    private Mock mockT = mock(T.class);

    private T t = (T) mockT.proxy();

    public void testCanMatchArrayContainingMatchingElement() {
        mockT.expects(atLeastOnce()).method("withArray").with(arrayContaining(eq("a")));
        t.withArray(new String[] { "A", "a", "Aa" });
        try {
            t.withArray(new String[] { "B", "b", "Bb" });
            fail("should not have been expected");
        } catch (DynamicMockError e) {
        }
    }

    public interface T {

        void withArray(Object[] a);

        void withList(List l);

        void withSet(Set s);

        void withMap(Map m);

        void withObject(Object o);
    }
}
