package pro.sky.calculator.exception;

public class CalculatorException extends RuntimeException{
    private final int errorCode;

    public CalculatorException(int errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}