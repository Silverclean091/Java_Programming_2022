package may3;

class A {
    void print() {
        System.out.println("Class A");
    }
}

class B extends A {

    @Override
    void print() {
        System.out.println("class B");
    }

}

public class OverRiding {

    public static void main(String[] args) {

        A a = new A();
        a.print();
        // 위와 아래는 둘 다 동일한 작업을 수행
        new B().print();
    }

}
