import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter first number:");
        float num1 = user_input.nextFloat();
        System.out.println("Enter the operator: ");
        char operator = user_input.next().charAt(0); // ?????
        System.out.println("Enter second number:");
        float num2 = user_input.nextFloat();
        float Result = 0;
        switch (operator) {
            case '+':
                Result = num1 + num2;
                break;
            case '-':
                Result = num1 - num2;
                break;
            case '*':
                Result = num1 * num2;
                break;
            case '/':
                Result = num1 / num2;
                break;
            case '%':
                Result = num1 % num2;
                break;

            default:
                System.out.println("Select operator from (+,-,*,/,%) only!");
                break;
        }
        System.out.println("Result: " + Result);
    }
}
