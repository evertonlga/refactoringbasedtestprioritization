package byTestCase.output;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;
import junit.framework.TestCase;
import org.jmock.core.constraint.HasPropertyWithValue;
import org.jmock.core.constraint.IsAnything;
import org.jmock.core.constraint.IsEqual;
import org.jmock.core.constraint.IsSame;

public class HasPropertyWithValueTest_3 extends TestCase {

    private final BeanWithoutInfo shouldMatch = new BeanWithoutInfo("is expected");

    private final BeanWithoutInfo shouldNotMatch = new BeanWithoutInfo("not expected");

    private final BeanWithInfo beanWithInfo = new BeanWithInfo("with info");

    public void testDoesNotMatchInfolessBeanWithoutMatchedNamedProperty() {
        HasPropertyWithValue hasProperty = new HasPropertyWithValue("nonExistentProperty", new IsAnything());
        assertFalse(hasProperty.eval(shouldNotMatch));
    }

    public static class BeanWithoutInfo {

        private String property;

        public BeanWithoutInfo(String property) {
            this.property = property;
        }

        public String getProperty() {
            return property;
        }

        public void setProperty(String property) {
            this.property = property;
        }

        public void setWriteOnlyProperty(float property) {
        }

        public String toString() {
            return "[Person: " + property + "]";
        }
    }

    public static class BeanWithInfo {

        private String propertyValue;

        public BeanWithInfo(String propertyValue) {
            this.propertyValue = propertyValue;
        }

        public String property() {
            return propertyValue;
        }
    }

    public static class BeanWithInfoBeanInfo extends SimpleBeanInfo {

        public PropertyDescriptor[] getPropertyDescriptors() {
            try {
                return new PropertyDescriptor[] { new PropertyDescriptor("property", BeanWithInfo.class, "property", null) };
            } catch (IntrospectionException e) {
                throw new RuntimeException("Introspection exception: " + e.getMessage());
            }
        }
    }
}
