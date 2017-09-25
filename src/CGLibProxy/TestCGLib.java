package CGLibProxy;

public class TestCGLib {
    public static void main(String[] args) {
        BookFacadeProxy bookFacadeProxy = new BookFacadeProxy();
        BookFacadeCGLibImpl bookFacadeCGLib = (BookFacadeCGLibImpl) bookFacadeProxy.getInstance(new BookFacadeCGLibImpl());
        bookFacadeCGLib.addBook();
    }
}
