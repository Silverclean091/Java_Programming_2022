package createInterface;

// interface는 기본적으로 abstract
interface A {
    abstract void abc();
    void bcd();              // abstract 생략 가능
}

class B implements A {

    @Override
    public void abc() {
        System.out.println(" implemented method abc ");
    }

    @Override
    public void bcd() {
        System.out.println(" implemented method bcd ");
    }
}

public class CreateInterface {
    public static void main(String[] args) {
        A b1 = new B();
        B b2 = new B();

        b1.abc();
        b2.abc();
    }
}
