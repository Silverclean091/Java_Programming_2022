package may9;

class AA {
    void abc() {
        System.out.println(" class A ... abc() ");
    }
}

class BB extends AA {
    @Override
    void abc() {
        System.out.println(" class B ... abc() ");
    }
    void bcd() {
        // this.abc();  // class B의 abc
        super.abc();    // 상속받은 class A의 abc를 나타냄
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        BB bb = new BB();
        bb.abc();
        bb.bcd();
    }
}
