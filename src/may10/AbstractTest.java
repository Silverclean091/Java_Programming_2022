package may10;

abstract class Animal {
    // class 안에 abstract이 한 개라도 있으면 클래스에도 abstract을 붙여줘야 함
    // abstract은 아직 표현되지 않은 추상화단계라는 뜻
    abstract void cry();
    int age = 0;
    // abstract 안에 abstract이 아닌 메소드도 구현 가능
    void walk() {
        System.out.println("walking");
    }
}

class Bird extends Animal {
    // 클래스 생성시 에러 발생. abstract 메소드를 구현해야 에러가 사라짐
    @Override
    void cry() {
        System.out.println("짹짹");
    }
}

class Cat extends Animal {
    int age = 5;
    @Override
    void cry() {
        System.out.println("야옹");
    }
}

public class AbstractTest {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.cry();
        System.out.println(cat.age);
    }
}
