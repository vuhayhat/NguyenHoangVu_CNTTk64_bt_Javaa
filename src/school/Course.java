package school;

import java.util.ArrayList;
import java.util.List;
    public class Course {

        private String name;
        private String course_ID;
        private Department department;
        private Instructor instructor;
        private List<Student> students;

        public Course(String name, String course_ID, Department department) {
            this.name = name;
            this.course_ID = course_ID;
            this.department = department;
            this.students = new ArrayList<>();
        }

        public void setInstructor(Instructor instructor) {
            this.instructor = instructor;
        }

        public Instructor getInstructor() {
            return this.instructor;
        }

        public String getName() {
            return this.name;
        }

        public String getCourseID() {
            return this.course_ID;
        }

        public void enrollStudent(Student student) {
            this.students.add(student);
            student.enroll(this);
        }

        public List<Student> getStudents() {
            return this.students;
        }
    }
