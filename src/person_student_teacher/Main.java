package person_student_teacher;
//qua la tuyet voi
public class Main {
    public static void main(String[] args) {
        // Tạo một sinh viên
        Student sinhVien = new Student("Nguyen hoang Vu", "le thuy");
        sinhVien.addCourse("Toan");
        sinhVien.addCourse("Vat ly");
        sinhVien.addCourseGrade("Toan", 90);
        sinhVien.addCourseGrade("Vat ly", 85);

        // Hiển thị thông tin sinh viên
        System.out.println("Thong tin sinh vien:");
        System.out.println(sinhVien);
        sinhVien.printGrades();
        System.out.println("Diem trung binh: " + sinhVien.getAverageGrade());
        System.out.println();

        // Tạo một giáo viên
        Teacher giaoVien = new Teacher("Hoang Tuan Nha", "Dong hoi");
        giaoVien.addCourse("Toan");
        giaoVien.addCourse("Vat ly");

        // Hiển thị thông tin giáo viên
        System.out.println("thong tin giao vien:");
        System.out.println(giaoVien);
        System.out.println();

        // Xóa một khóa học khỏi danh sách của giáo viên
        System.out.println("Dang xoa ...");
        giaoVien.removeCourse("Toan");
        System.out.println(giaoVien);
    }
}
