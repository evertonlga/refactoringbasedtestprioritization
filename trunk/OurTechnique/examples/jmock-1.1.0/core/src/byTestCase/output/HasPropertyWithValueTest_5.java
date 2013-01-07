package byTestCase.output;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;
import junit.framework.TestCase;
import org.jmock.core.constraint.HasPropertyWithValue;
import org.jmock.core.constraint.IsAnything;
import org.jmock.core.constraint.IsEqual;
import org.jmock.core.constraint.IsSame;

public class HasPropertyWithValueTest_5 extends TestCase {

    private final BeanWithoutInfo shouldMatch = new BeanWithoutInfo("is expected");

    private final BeanWithoutInfo shouldNotMatch = new BeanWithoutInfo("not expected");

    private final BeanWithInfo beanWithInfo = new BeanWithInfo("with info");

    public void testDescribeTo() {
        IsEqual isEqual = new IsEqual(new Boolean(true));
        String isEqualDescription = isEqual.describeTo(new StringBuffer()).toString();
        HasPropertyWithValue hasProperty = new HasPropertyWithValue("property", new IsEqual(new Boolean(true)));
        assertEquals("hasProperty(\"property\", " + isEqualDescription + ")", hasProperty.describeTo(new StringBuffer()).toString());
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
