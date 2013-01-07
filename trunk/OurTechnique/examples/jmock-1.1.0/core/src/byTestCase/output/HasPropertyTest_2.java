package byTestCase.output;

import junit.framework.TestCase;
import org.jmock.core.constraint.HasProperty;

import core.tests.HasPropertyWithValueTest;

public class HasPropertyTest_2 extends TestCase {

    private final HasPropertyWithValueTest.BeanWithoutInfo bean = new HasPropertyWithValueTest.BeanWithoutInfo("a bean");

    public void testReturnsFalseIfPropertyDoesNotExist() {
        HasProperty hasProperty = new HasProperty("aNonExistentProp");
        assertFalse(hasProperty.eval(bean));
    }
}
