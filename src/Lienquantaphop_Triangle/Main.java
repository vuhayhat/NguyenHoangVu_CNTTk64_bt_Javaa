package Lienquantaphop_Triangle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập tọa độ 3 điểm
        System.out.print("Nhập tọa độ x của điểm thứ nhất: ");
        int x1 = scanner.nextInt();
        System.out.print("Nhập tọa độ y của điểm thứ nhất: ");
        int y1 = scanner.nextInt();
        System.out.print("Nhập tọa độ x của điểm thứ hai: ");
        int x2 = scanner.nextInt();
        System.out.print("Nhập tọa độ y của điểm thứ hai: ");
        int y2 = scanner.nextInt();
        System.out.print("Nhập tọa độ x của điểm thứ ba: ");
        int x3 = scanner.nextInt();
        System.out.print("Nhập tọa độ y của điểm thứ ba: ");
        int y3 = scanner.nextInt();

        // Tạo 3 điểm
        Point vertice1 = new Point(x1, y1);
        Point vertice2 = new Point(x2, y2);
        Point vertice3 = new Point(x3, y3);

        // Tạo tam giác
        Triangle triangle = new Triangle(vertice1, vertice2, vertice3);

        // Hiển thị thông tin tam giác
        System.out.println(triangle);

        // Tính chu vi
        double perimeter = triangle.getPerimeter();

        // Hiển thị chu vi
        System.out.println("Chu vi tam giác: " + perimeter);
    }
}

