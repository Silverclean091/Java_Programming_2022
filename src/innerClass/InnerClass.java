package innerClass;

abstract class A {
    abstract void abc();
}

public class InnerClass {
    public static void main(String[] args) {

        // main 함수 안에 쓰는 method = inner method
        class B extends A {
            @Override
            void abc() {
                System.out.println(" named inner class method ");
            }
        }

        B b = new B();

        A a = new A() {
            @Override
            void abc() {
                System.out.println(" anonymous inner class method ");
            }
        };

        a.abc();
        a.abc();
        b.abc();
//        b.bcd();

    }
}
