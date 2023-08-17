package practice.design.proxy;

public class Service implements IService{

    @Override
    public String execute() {
        return "Service.execute()";
    }
}
