package byTestCase.output;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import org.jmock.core.Invocation;
import org.jmock.core.Stub;
import org.jmock.core.stub.ReturnIteratorStub;
import junit.framework.TestCase;

public class ReturnIteratorStubTest_1 extends TestCase {

    private static final String resultElements[] = { "0", "1", "2", "3" };

    private static final Invocation ANY_INVOCATION = null;

    public void testReturnsIteratorOverContentsOfCollection() throws Throwable {
        Collection collection = collectionOf(resultElements);
        Stub stub = new ReturnIteratorStub(collection);
        assertIteratorOverSequence((Iterator) stub.invoke(ANY_INVOCATION), resultElements);
    }

    private Collection collectionOf(String[] values) {
        return Arrays.asList(values);
    }

    private void assertIteratorOverSequence(Iterator iterator, String[] values) {
        for (int i = 0; i < values.length; i++) {
            assertEquals("element " + i, values[i], iterator.next());
        }
    }
}
