package FactoryMethodPattern;

// 팩터리가 메서드가 생성할 객체
public class CatToy extends AnimalToy {
    @Override
    public void identify() {
        System.out.println("고양이 장난감인 캣 타워다.");
    }
}
