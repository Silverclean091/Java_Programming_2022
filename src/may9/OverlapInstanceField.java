package may9;

class A {
    int m = 3;
    void print() {
        System.out.println(" class A ");
    }
}

class B extends A {
    int m = 5;
    @Override    // 상속받았지만 덮어쓰는 것
    void print() {
        System.out.println(" class B ");
    }
}

public class OverlapInstanceField {
    public static void main(String[] args) {
        A aa = new A();     // 3
        B bb = new B();     // 5
        A ab = new B();     // 3

        System.out.println(aa.m);
        System.out.println(bb.m);
        System.out.println(ab.m);

        aa.print();     // class A
        bb.print();     // class B
        ab.print();     // ★class B

        // Math m = new Math();
        Math.sin(3.14);
    }
}
