package exception;

import java.util.List;

public class PositivException extends Exception{

    public PositivException(int num) {
        super(String.valueOf(num));
    }
}
