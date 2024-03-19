package Abtract_Shape;



public class Main {
    public static void main(String[] args) {
        // Khởi tạo một hình tròn
        Circle circle = new Circle(5.0, "blue", true);

        // In ra thông tin của hình tròn
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        // Xuống dòng
        System.out.println();

        // Khởi tạo một hình vuông
        Square square = new Square(4.0, "red", false);

        // In ra thông tin của hình vuông
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());

        // Xuống dòng
        System.out.println();

        // Khởi tạo một hình chữ nhật
        Rectangle rectangle = new Rectangle(3.0, 4.0, "green", true);

        // In ra thông tin của hình chữ nhật
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}
