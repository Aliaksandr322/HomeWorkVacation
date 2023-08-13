package abstracts.task7;

public class Car extends Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Car: Starting the engine...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car: Stopping the engine...");
    }
}
