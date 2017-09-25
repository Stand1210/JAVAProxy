package jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk动态代理代理类
 */
public class BookFacadeProxy implements InvocationHandler {
    private Object target;//要绑定（被代理）的对象

    /**
     * 绑定委托对象并返回一个代理类
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    public Object bind(Object object) {
        this.target = object;
        //取得代理对象
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    /**
     * 调用方法
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("事物开始");
        result = method.invoke(target, args);
        System.out.println("事物结束");
        return result;
    }
}
