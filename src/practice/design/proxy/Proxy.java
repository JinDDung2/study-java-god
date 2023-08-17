package practice.design.proxy;

public class Proxy implements IService{
    private IService iService;

    public Proxy() {
        this.iService = new Service();
    }

    @Override
    public String execute() {
        System.out.println("프록시 패턴은 호출에 대한 흐름 제어가 주 목적이고 반환 결과는 그대로 전달한다.");
        return iService.execute();
    }
}
