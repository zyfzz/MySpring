package proxy.jdkProxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        Fruit fruit = (Fruit)Proxy.newProxyInstance(Fruit.class.getClassLoader(),new Class[]{Fruit.class},new DynamicAgent(new Apple()));
        fruit.hi();
        fruit.show();
    }
}
