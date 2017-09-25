package staticProxy;

/**
 * 委托类，包含业务逻辑
 */
public class CountImpl implements Count {
    int count;
    @Override
    public void queryCount() {
        System.out.println("查看账户方法：" + count);
    }

    @Override
    public void updateCount(int count) {
        this.count = count;
        System.out.println("修改账户方法: " + count);
    }
}
