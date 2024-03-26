package Pizza;

public class Rectangle implements IShape {
    private double _width;
    private double _height;
    public Rectangle(double width, double height) {
        _width = width;
        _height = height;
    }
    public double getArea(){
        return _width * _height;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + _width +
                ", height=" + _height +
                '}';
    }
}