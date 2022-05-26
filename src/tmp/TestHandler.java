package tmp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TestHandler implements InvocationHandler {

    private Object target;

    public TestHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理开始");

        Object ret = method.invoke(target, args);

        System.out.println("代理结束");

        return ret;
    }
}
