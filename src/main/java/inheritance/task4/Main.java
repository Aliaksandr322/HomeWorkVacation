package inheritance.task4;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(40000);
        HRManager hrManager = new HRManager(1000000);
        System.out.println(employee.getSalary());
        System.out.println(hrManager.getSalary());

        employee.work();
        hrManager.work();
        hrManager.addEmployee();
    }
}
