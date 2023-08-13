package abstracts.task5;

public abstract class Employee {
    protected  int salary ;

    protected  String name;

    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public abstract double calculateSalary();

    public abstract void displayInfo();
}
