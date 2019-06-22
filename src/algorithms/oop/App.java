package algorithms.oop;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("============================================");
        System.out.println("Abstraction");
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.roar();
        dog.roar();

        cat.catIsDoingSomething();
        dog.dogIsDoingSomething();

        System.out.println("============================================");
        System.out.println("Polymorphism through inheritance");

        List<Animal> animals = new ArrayList<>();

        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Horse());

        for (Animal animal :
                animals) {
            animal.touch();
        }

        System.out.println("============================================");
        System.out.println("Polymorphism through interfaces");

        List<Figure> figures = new ArrayList<>();

        figures.add(new Cube(5));
        figures.add(new Circle(4));

        for (Figure figure :
                figures) {
            System.out.println(figure.getName() + ": square = " + figure.getSquare());
        }
    }
}
