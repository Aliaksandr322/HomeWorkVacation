package exception;

public class NonDifNum extends Exception{
    public NonDifNum(int num) {
        super(String.valueOf(num));
    }
}
