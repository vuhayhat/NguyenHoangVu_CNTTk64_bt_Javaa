package school;

public class Main {
    public static void main(String[] args) {

        // Khởi tạo trường học
        School school = new School("Trường Đại học QBU", "DONG HOI", "028383928498");

        // Khởi tạo khoa
        Department khoaCNTT = new Department("Khoa CNTT");

        // Thêm khoa vào trường học
        school.addDepartment(khoaCNTT);

        // Khởi tạo giảng viên
        Instructor giangVienA = new Instructor("NHA", "nguyenvanvu@QBU.edu.vn");

        // Thêm giảng viên vào khoa
        khoaCNTT.addInstructor(giangVienA);

        // Khởi tạo khóa học
        Course lapTrinhJava = new Course("Laptrinhjava", "001", khoaCNTT);

        // Gán giảng viên cho khóa học
        lapTrinhJava.setInstructor(giangVienA);

        // Thêm khóa học vào khoa
        khoaCNTT.addCourse(lapTrinhJava);

        // Khởi tạo sinh viên
        Student sinhVien1 = new Student(" VU", "123456789", "tranthib@fpt.edu.vn");
        Student sinhVien2 = new Student(" THANH NHUNG ", "987654321", "levanc@fpt.edu.vn");

        // Thêm sinh viên vào khóa học
        lapTrinhJava.enrollStudent(sinhVien1);
        lapTrinhJava.enrollStudent(sinhVien2);

        // In thông tin khóa học
        System.out.println("Tên trường học: " + school.getName());
        System.out.println("**Thông tin khóa học:**");
        System.out.println("Tên khóa học: " + lapTrinhJava.getName() + " (" + lapTrinhJava.getCourseID() + ")");
        System.out.println("Giảng viên: " + lapTrinhJava.getInstructor().getName());
        System.out.println("Danh sách sinh viên:");
        for (Student student : lapTrinhJava.getStudents()) {
            System.out.println("- " + student.getName() + " (" + student.getStudentID() + ")");
        }
    }
}
