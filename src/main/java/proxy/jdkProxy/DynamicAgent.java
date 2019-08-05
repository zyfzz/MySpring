package proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicAgent implements InvocationHandler{

    private Object proxy;
    public DynamicAgent(Object proxy) {
        this.proxy = proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(">>>>before invoking");
        Object result=method.invoke(this.proxy,args);
        System.out.println(">>>>after invoking");
        return result;
    }
}
