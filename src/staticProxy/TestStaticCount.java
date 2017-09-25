package staticProxy;

/**
 * 测试静态代理
 */
public class TestStaticCount {
    public static void main(String[] args) {
        CountImpl countImpl = new CountImpl();
        CountProxy countProxy = new CountProxy(countImpl);
        countProxy.updateCount(10);
        countProxy.queryCount();
    }
}
