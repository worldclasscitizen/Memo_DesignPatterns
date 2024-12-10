package FactoryMethodPattern;

// 팩터리가 메서드가 생성할 객체
public class DogToy extends AnimalToy {
    public void identify() {
        System.out.println("강아지 장난감인 테니스공이다.");
    }
}
