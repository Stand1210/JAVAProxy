package jdkProxy;

public class TestJDKProxy {
    public static void main(String[] args) {
        BookFacadeProxy proxy = new BookFacadeProxy();
        BookFacade bookFacade = (BookFacade) proxy.bind(new BookFacadeImpl());
        bookFacade.addBook();
    }
}
