public class Calculator {

    public static final String Addition = "+";
    public static final String Subtraction = "-";
    public static final String Multiplication = "*";
    public static final String Division = "/";

    public static int calculate(int firstOperand, int secondOperand, String operator) {
        switch (operator) {
            case Addition:
                return firstOperand + secondOperand;
            case Subtraction:
                return firstOperand - secondOperand;
            case Multiplication:
                return firstOperand * secondOperand;
            case Division:
                if (secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
