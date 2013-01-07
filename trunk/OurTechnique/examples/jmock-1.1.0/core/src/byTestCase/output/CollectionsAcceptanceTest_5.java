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

public class CollectionsAcceptanceTest_5 extends MockObjectTestCase {

    private Mock mockT = mock(T.class);

    private T t = (T) mockT.proxy();

    public void testCanMatchSetContainingEqualElement() {
        mockT.expects(once()).method("withSet").with(collectionContaining("a"));
        Set set = new HashSet();
        set.add("A");
        set.add("a");
        set.add("Aa");
        t.withSet(set);
    }

    public interface T {

        void withArray(Object[] a);

        void withList(List l);

        void withSet(Set s);

        void withMap(Map m);

        void withObject(Object o);
    }
}
