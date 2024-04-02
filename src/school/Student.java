package school;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private String studentID;
    private List<Course> courses;

    public Student(String name, String studentID, String email) {
        this.name = name;
        this.studentID = studentID;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public String getStudentID() {
        return this.studentID;
    }

    public void enroll(Course course) {
        this.courses.add(course);
    }

    public void dropCourse(Course course) {
        this.courses.remove(course);
    }
}
