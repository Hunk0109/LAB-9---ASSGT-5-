package edu.northeastern.csye6200;

public class Lab9P2 {
    public static void main(String[] args) {
        // TODO: write your code here

        GeometricObject[] objects = {
                new Square(2),
                new Circle(5),
                new Square(5),
                new Rectangle(3, 4),
                new Square(4.5)
        };

        for (GeometricObject object : objects) {
            System.out.println("Area is " + object.getArea());

            if (object instanceof Colorable) {
                ((Colorable) object).howToColor();
            }

            System.out.println();
        }
    }
}

interface Colorable {
    void howToColor();
}

abstract class GeometricObject {
    public abstract double getArea();

    public abstract double getPerimeter();
}

class Square extends GeometricObject implements Colorable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}

class Circle extends GeometricObject {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

