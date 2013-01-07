package byTestCase.output;

import org.jmock.MockObjectTestCase;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Constants;

public class ClassLoaderAcceptanceTest_1 extends MockObjectTestCase {

    public void testMockingTypeFromOtherClassLoader() throws ClassNotFoundException {
        ClassLoader interfaceClassLoader = new EmptyInterfaceCreator();
        Class interfaceClass = interfaceClassLoader.loadClass("UniqueTypeName");
        mock(interfaceClass);
    }

    static class EmptyInterfaceCreator extends ClassLoader {

        protected Class findClass(String name) {
            ClassWriter writer = new ClassWriter(true);
            writer.visit(Constants.ACC_PUBLIC | Constants.ACC_INTERFACE, name.replace('.', '/'), "java/lang/Object", null, null);
            byte[] b = writer.toByteArray();
            return defineClass(name, b, 0, b.length);
        }
    }
}
