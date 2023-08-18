package practice.design.adapter;

public class AdapterServiceB {
    private ServiceB serviceB;

    public AdapterServiceB() {
        serviceB = new ServiceB();
    }

    public void run() {
        serviceB.run();
    }
}
