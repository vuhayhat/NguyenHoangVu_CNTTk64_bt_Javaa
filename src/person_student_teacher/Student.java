package person_student_teacher;

import java.util.Arrays;

public class Student extends Person {
    private int numCourses;
    private String[] courses;
    private int[] grades;
    private static final int MAX_COURSES = 30; //Hằng số này được sử dụng để giới hạn số lượng khóa học tối đa

    public Student(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new String[MAX_COURSES];
        grades = new int[MAX_COURSES];
    }

    public void addCourse(String course) {
        courses[numCourses] = course;
        numCourses++;
    }

    public void addCourseGrade(String course, int grade) {
        int courseIndex = Arrays.asList(courses).indexOf(course);
        if (courseIndex != -1) {
            grades[courseIndex] = grade;
        }
    }

    public void printGrades() {
        System.out.println("Grades:");
        for (int i = 0; i < numCourses; i++) {
            System.out.println(courses[i] + ": " + grades[i]);
        }
    }

    public double getAverageGrade() {
        if (numCourses == 0) {
            return 0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / numCourses;
    }

    @Override
    public String toString() {
        return "Student[name=" + getName() + ", address=" + getAddress() + "]";
    }
}
