package byTestCase.output;

import junit.framework.TestCase;
import org.jmock.core.constraint.HasProperty;

import core.tests.HasPropertyWithValueTest;

public class HasPropertyTest_3 extends TestCase {

    private final HasPropertyWithValueTest.BeanWithoutInfo bean = new HasPropertyWithValueTest.BeanWithoutInfo("a bean");

    public void testDescribeTo() {
        HasProperty hasProperty = new HasProperty("property");
        StringBuffer buffer = new StringBuffer();
        hasProperty.describeTo(buffer);
        assertEquals("hasProperty(\"property\")", buffer.toString());
    }
}
