package byTestCase.output;

import junit.framework.TestCase;
import org.jmock.core.constraint.HasProperty;

import core.tests.HasPropertyWithValueTest;

public class HasPropertyTest_1 extends TestCase {

    private final HasPropertyWithValueTest.BeanWithoutInfo bean = new HasPropertyWithValueTest.BeanWithoutInfo("a bean");

    public void testReturnsTrueIfPropertyExists() {
        HasProperty hasProperty = new HasProperty("writeOnlyProperty");
        assertTrue(hasProperty.eval(bean));
    }
}
