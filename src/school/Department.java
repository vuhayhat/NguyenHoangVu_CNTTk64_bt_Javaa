package school;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    private List<Instructor> instructors;
    private List<Course> courses;

    public Department(String name) {
        this.name = name;
        this.instructors = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addInstructor(Instructor instructor) {
        this.instructors.add(instructor);
    }

    public void removeInstructor(Instructor instructor) {
        this.instructors.remove(instructor);
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public void removeCourse(Course course) {
        this.courses.remove(course);
    }
}
