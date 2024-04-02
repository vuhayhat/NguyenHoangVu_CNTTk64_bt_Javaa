package school;


import java.util.ArrayList;
import java.util.List;

public class School {

    private String name;
    private String address;
    private String phone_number;
    private List<Department> departments;

    public School(String name, String address, String phone_number) {
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        this.departments.add(department);
    }

    public void removeDepartment(Department department) {
        this.departments.remove(department);
    }
    public String getName() {
        return this.name;
    }
    @Override
    public String toString() {
        return "School Name: " + name + "\n" +
                "Address: " + address + "\n" +
                "Phone Number: " + phone_number + "\n" +
                "Departments: " + departments;
    }
}
