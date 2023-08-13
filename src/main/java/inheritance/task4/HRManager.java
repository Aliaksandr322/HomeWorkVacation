package inheritance.task4;

public class HRManager extends Employee{

    public HRManager(int salary) {
        super(salary);
    }

    @Override
    public void work() {
        System.out.println("HRManager is working");
    }

    public void addEmployee(){
        System.out.println("Adding new employee!");
    }

}
