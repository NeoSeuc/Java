package oop;

class Dog extends Animal {
    @Override
    void roar() {
        System.out.println("Now Dog uses method \"roar\" from basic abstract class");
    }

    void dogIsDoingSomething() {
        System.out.println("Now Dog uses specific method for instance of a Abstraction class");
    }

    @Override
    void touch() {
        System.out.println("dog starts running...");
    }
}
