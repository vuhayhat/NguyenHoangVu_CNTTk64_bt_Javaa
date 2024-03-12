package IEmployee;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên nhân viên: ");
        String name = scanner.nextLine();
        System.out.print("Lương theo giờ: ");
        int paymentPerHour = scanner.nextInt();
        System.out.print("Loại nhân viên (1. Part-time | 2. Full-time): ");
        int employeeType = scanner.nextInt();

        System.out.println("---Thông tin nhân viên---");
        System.out.println("Tên: " + name);
        System.out.println("Loại nhân viên: " + (employeeType == 1 ? "Parttime" : "Fulltime"));
        System.out.println("Lương theo giờ: " + paymentPerHour);

        if (employeeType == 1) {
            System.out.print("Số giờ làm việc: ");
            int workingHours = scanner.nextInt();
            System.out.println("Tổng lương: " + workingHours * paymentPerHour);
        } else {
            System.out.println("Lương tháng: " + paymentPerHour * 20 * 8);
        }

        scanner.close();
    }
}
