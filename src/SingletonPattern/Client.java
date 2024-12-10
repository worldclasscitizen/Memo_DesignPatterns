package SingletonPattern;

public class Client {
    public static void main(String[] args) {
        // 단일 객체를 사용하고 있기 때문에 속성을 갖지 않도록 하는 것이 정석이다.
        // 서로 다른 참조 변수에 영향을 미칠 수도 있기 때문이다.

        // 읽기 전용 속성은 예외
        // 단일 객체가 다른 단일 객체에 대한 참조를 속성으로 가진 것 또한 예외

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        s1 = null;
        s2 = null;
        s3 = null;
    }
}
