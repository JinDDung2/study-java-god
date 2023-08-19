package practice.design.proxy;

public class Client {
    public static void main(String[] args) {
        IService proxy = new Proxy();
        System.out.println(proxy.execute());

        IService decorator = new Decorator();
        System.out.println(decorator.execute());
    }
}
