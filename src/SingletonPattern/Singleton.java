package SingletonPattern;

public class Singleton {
    // new 를 실행할 수 없도록 생성자에 private 접근 제어자를 지정한다.
    // 유일한 단일 객체를 반환하는 정적 메서드가 필요하다.
    // 유일한 단일 객체를 참조할 정적 참조 변수가 필요하다.

    static Singleton singletonObject;

    private Singleton() {};

    public static Singleton getInstance() {
        if (singletonObject == null) {
            singletonObject = new Singleton();
        }

        return singletonObject;
    }
}
