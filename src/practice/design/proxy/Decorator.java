package practice.design.proxy;

public class Decorator implements IService{
    private IService iService;

    public Decorator() {
        this.iService = new Service();
    }

    @Override
    public String execute() {
        System.out.println("호출에 대한 장식이 주 목적, 클라이언트에게 반한 결과에 장식을 더하야 전달한다.");
        return iService.execute() + " 장식한 내용";
    }
}
