package abstractClass;

// 한 클래스 안에는 abstract인 것과 아닌 것이 공존 가능
// 그러나 클래스 내에 abstract인 것이 하나라도 존재할 경우,
// 해당 클래스는 무조건 abstract을 붙여줘야 함
abstract class A {
    abstract void abc();
    void bcd() {
        System.out.println(" normal method ");
    }
}

class B extends A {

    @Override   // 이 과정을 거쳐야 class B에 에러가 발생하지 않음
    void abc() {
        System.out.println(" abstract method ");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        A b1 = new B();     // 다형성에 의해 자식 클래스인 B의 생성자로 A 인스턴스 생성 가능
        // A b2 = new A();  // A는 abstract class임으로 불완전하여 사용 불가능

        A b2 = new A() {
            @Override
            void abc() {
                System.out.println(" inner class method ");
            }};

        b1.abc();
        b1.bcd();
        b2.abc();
        b2.bcd();
    }
}
