package may3;

class Animal {
    void cry() {}
}

class Bird extends Animal {
    @Override
    void cry() {
        System.out.println("짹짹");
    }
}

class Cat extends Animal {
    @Override
    void cry() {
        System.out.println("야옹");
    }
}

class Dog extends Animal {
    @Override
    void cry() {
        System.out.println("멍멍");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {

        Bird b = new Bird();
        b.cry();
        new Cat().cry();
        new Dog().cry();

        Animal[] animals = { new Bird(), new Cat(), new Dog()};

        for(Animal a : animals) {
            a.cry();
        }

        for (int i = 0; i < animals.length; i++) {
            animals[i].cry();
        }
    }
}