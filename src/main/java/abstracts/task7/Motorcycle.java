package abstracts.task7;

public class Motorcycle extends Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Motorcycle: Starting the engine...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle: Stopping the engine...");
    }
}
