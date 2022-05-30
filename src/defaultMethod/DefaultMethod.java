package defaultMethod;

interface A {
    void abc();
    default void bcd() {
        System.out.println(" default method ");
    }
}

class B implements A {
    @Override
    public void abc() {
        System.out.println(" abstract method implements ");
    }
    @Override
    public void bcd() {
        A.super.bcd();
        System.out.println(" override method ");
    }
}

public class DefaultMethod {
    public static void main(String[] args) {
        B b = new B();
        b.abc();
        b.bcd();
    }
}
