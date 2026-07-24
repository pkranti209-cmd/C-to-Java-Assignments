//1. Accept two numbers from user and an operator (+,-,/,*,%) based on //that perform the
//desired operations.

public class ArithmeticOperation {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        char op = '+';

        if (op == '+')
            System.out.println("Addition = " + (a + b));
        else if (op == '-')
            System.out.println("Subtraction = " + (a - b));
        else if (op == '*')
            System.out.println("Multiplication = " + (a * b));
        else if (op == '/')
            System.out.println("Division = " + (a / b));
        else if (op == '%')
            System.out.println("Modulus = " + (a % b));
        else
            System.out.println("Invalid Operator");
    }
}