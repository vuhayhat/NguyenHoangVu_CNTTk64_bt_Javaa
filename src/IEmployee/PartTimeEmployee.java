package IEmployee;
public class PartTimeEmployee extends Employee implements IEmployee {
    int workingHours;

    public PartTimeEmployee(String name, int paymentPerHour, int workingHours, String department, String position, String startDate) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return this.workingHours * paymentPerHour;
    }
}