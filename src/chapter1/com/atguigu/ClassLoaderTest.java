package chapter1.com.atguigu;

public class ClassLoaderTest {
    public static void main(String[] args) {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);
        System.out.println(systemClassLoader.getParent());
        System.out.println(systemClassLoader.getParent().getParent());

        System.out.println(ClassLoaderTest.class.getClassLoader());
        System.out.println(String.class.getClassLoader());
    }
}
