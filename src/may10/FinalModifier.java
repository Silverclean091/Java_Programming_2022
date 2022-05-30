package may10;

class A {
    final int b;    // final은 초기화를 안 해주면 에러가 발생
    A() {
        b = 5;          // 그러나 생성자에서 초기화를 해주어도 괜찮음
    }
    final void abc() {
        System.out.println("Final test A");
    }
}

class B extends A {
 //   void abc() {
 //       System.out.println("Final test B");
 //   }
 // final의 경우 Overriding 불가능    
}

public class FinalModifier {
    public static void main(String[] args) {

        final int a = 5;    // c에서의 const와 같은 의미

        System.out.println(a);
        // a = 10;

    }
}

// ① 클래스에 final 사용 : 상속 불가능
// ② 메소드에 final 사용 : 오버라이딩 불가능
// ③ 변수에 final 사용 : 이후 값 변경 불가능
