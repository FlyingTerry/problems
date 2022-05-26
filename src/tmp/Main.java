package tmp;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        String s = "hello";
        CharSequence sequence = (CharSequence) Proxy.newProxyInstance(
                s.getClass().getClassLoader(),
                s.getClass().getInterfaces(),
                new TestHandler(s));
        System.out.println(sequence);
    }
}
