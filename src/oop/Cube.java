package oop;

public class Cube implements Figure {
    private final int a;
    private String name = "Cube";

    Cube(int a) {
        this.a = a;
    }

    Cube(String name, int a) {
        this(a);
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getSquare() {
        return 6 * a;
    }
}
