package abstracts.task5;

public class Programmer extends Employee{
    private int overtimeHours;
    private double hourlyRate;

    public Programmer(int salary, String name, int overtimeHours, double hourlyRate) {
        super(salary, name);
        this.overtimeHours = overtimeHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return salary + (overtimeHours * hourlyRate);
    }

    @Override
    public void displayInfo() {
        System.out.println("Programmer Name: " + name);
        System.out.println("Base Salary: $" + salary);
        System.out.println("Overtime Hours: " + overtimeHours);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Total Salary: $" + calculateSalary());
    }
}
