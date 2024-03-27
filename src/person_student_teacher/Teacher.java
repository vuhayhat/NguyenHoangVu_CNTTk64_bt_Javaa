package person_student_teacher;

import java.util.Arrays;

public class Teacher extends Person {
    private int numCourses;
    private String[] courses;
    private static final int MAX_COURSES = 30;

    public Teacher(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new String[MAX_COURSES];
    }

    public void addCourse(String course) {
        courses[numCourses] = course;
        numCourses++;
    }

    public void removeCourse(String course) {
        int courseIndex = Arrays.asList(courses).indexOf(course);
        if (courseIndex != -1) {
            for (int i = courseIndex; i < numCourses - 1; i++) {
                courses[i] = courses[i + 1];
            }
            numCourses--;
        }
    }

    @Override
    public String toString() {
        return "Teacher[name=" + getName() + ", address=" + getAddress() + "]";
    }
}
