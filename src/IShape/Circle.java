package IShape;

import IShape.IShape;

public class Circle extends IShape {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
    @Override
    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }
}

