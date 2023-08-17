package practice.design.proxy;

public class Client {
    public static void main(String[] args) {
        IService service = new Proxy();
        System.out.println(service.execute());
    }
}
