package DecoratorPattern;

public class Decorator implements IService {
    IService service;

    public String runSomething() {
        System.out.println("호출에 대한 장식이 주 목적, 클라이언트에게 반환 결과에 장식을 더하며 전달한다.");

        service = new Service();
        return "정말" + service.runSomething();
    }
}
