package chapter1.com.atguigu;

import com.sun.net.ssl.internal.ssl.Provider;
import sun.misc.Launcher;

import java.net.URL;

public class BootStrapClassLoaderTest {
    public static void main(String[] args) {
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL urL : urLs) {
            System.out.println(urL.toExternalForm());
        }
        System.out.println(Provider.class.getClassLoader());
    }
    
}
