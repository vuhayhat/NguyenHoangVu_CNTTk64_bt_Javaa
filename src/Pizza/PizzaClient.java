package Pizza;
import java.util.Scanner;
public class PizzaClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập giá pizza hình tròn:");
        double priceCircle = scanner.nextDouble();

        System.out.println("Nhập bán kính pizza hình tròn:");
        double radiusCircle = scanner.nextDouble();

        System.out.println("Nhập giá pizza hình chữ nhật:");
        double priceRectangle = scanner.nextDouble();

        System.out.println("Nhập chiều dài pizza hình chữ nhật:");
        double widthRectangle = scanner.nextDouble();

        System.out.println("Nhập chiều rộng pizza hình chữ nhật:");
        double heightRectangle = scanner.nextDouble();





        Pizza circle = new Pizza(priceCircle, new Circle(radiusCircle));
        Pizza rectangle = new Pizza(priceRectangle, new Rectangle(widthRectangle, heightRectangle));
        PizzaDeal pizzaDeal = new PizzaDeal();

        System.out.println("Thông tin so sánh:");
        System.out.println("Pizza hình tròn:");
        System.out.println("Giá: " + circle.getPrice());
        System.out.println("Diện tích: " + circle.getShape().getArea());
        System.out.println("Giá cho mỗi đơn vị diện tích: " + pizzaDeal.deal(circle));







        System.out.println("Pizza hình chữ nhật:");
        System.out.println("Giá: " + rectangle.getPrice());
        System.out.println("Diện tích: " + rectangle.getShape().getArea());
        System.out.println("Giá cho mỗi đơn vị diện tích: " + pizzaDeal.deal(rectangle));




        System.out.println("Pizza nào có giá tốt hơn: " + (pizzaDeal.betterDeal(circle, rectangle) ? "Hình tròn" : "Hình chữ nhật"));
    }
}
