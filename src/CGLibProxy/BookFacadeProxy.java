package CGLibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 使用CGLib动态代理
 */
public class BookFacadeProxy implements MethodInterceptor {
    private Object target;

    /**
     * 创建代理对象
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    public Object getInstance(Object object) {
        this.target = object;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        //回调方法
        enhancer.setCallback(this);
        //创建代理对象
        return enhancer.create();
    }

    @Override
    //回调方法
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("事物开始");
        methodProxy.invokeSuper(obj, args);
        System.out.println("事物结束");
        return null;
    }
}
