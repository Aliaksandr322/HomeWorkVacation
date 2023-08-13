package abstracts.task5;

public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager(6000, "Corona Cadogan", 1000);
        Employee programmer = new Programmer(5000, "Antal Nuka", 20, 25.0);

        manager.displayInfo();
        System.out.println("---------------------");
        programmer.displayInfo();
    }
}
