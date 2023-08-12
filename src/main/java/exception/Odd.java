package exception;

public class Odd extends Exception{
    private int number ;
    public  Odd(String message, int number){
        super(message);
        this.number = number;
    }
}
