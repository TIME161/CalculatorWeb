package pro.sky.calculator.exception;

public class DevideByZero extends CalculatorException{
    public DevideByZero() {
        super(400, "Делить на ноль нельзя");
    }
}