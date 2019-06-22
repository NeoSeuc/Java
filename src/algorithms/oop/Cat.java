package algorithms.oop;

class Cat extends Animal {
    @Override
    void roar() {
        System.out.println("Now Cat use method \"roar\" from basic abstract class");
    }

    void catIsDoingSomething() {
        System.out.println("Now Cat  uses specific method for instance of a Abstraction class");
    }
    @Override
    void touch() {
        System.out.println("Murrrrrr...");
    }
}
