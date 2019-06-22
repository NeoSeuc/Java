package algorithms.oop;

public class Circle implements Figure {
    private String name = "Circle";
    private double radius;
    private final double PI = 3.14;

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(String name, double radius) {
        this(radius);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSquare() {
        return PI * (radius * radius);
    }
}
