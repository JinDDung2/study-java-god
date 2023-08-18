package practice.design.adapter;

public class Client {
    public static void main(String[] args) {
        AdapterServiceA serviceA = new AdapterServiceA();
        AdapterServiceB serviceB = new AdapterServiceB();

        serviceA.run();
        serviceB.run();
    }
}
