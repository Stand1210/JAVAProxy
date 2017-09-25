package staticProxy;

/**
 * 代理类，增强countImpl实现类
 */
public class CountProxy implements Count {
    private CountImpl countImpl;

    public CountProxy(CountImpl countImpl) {
        this.countImpl = countImpl;
    }
    @Override
    public void queryCount() {
        System.out.println("处理事物之前");
        countImpl.queryCount();
        System.out.println("处理事物之后");
    }

    @Override
    public void updateCount(int count) {
        System.out.println("处理事物之前");
        countImpl.updateCount(count);
        System.out.println("处理事物之后");
    }
}
/*
观察代码发现，每一个代理类只能为一个接口服务，这样一来必然产生过多的代理。
而且，每个代理才做出了调用方法不一样之外，其他的操作都一样，此时肯定是重复代码。

解决这一问题最好的办法就是通过一个代理类能完成全部的代理功能，
此时必须通过动态代理完成。
 */