package practice.design.adapter;

public class AdapterServiceA {
    private ServiceA serviceA;

    public AdapterServiceA() {
        serviceA = new ServiceA();
    }

    public void run() {
        serviceA.run();
    }
}
