import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter expression below:");
        Scanner User_input = new Scanner(System.in);

        System.out.println("Enter value1:");
        String val1 = User_input.nextLine();
        System.out.println("Enter operator:");
        String operator = User_input.nextLine();
        System.out.println("Enter value2:");
        String val2 = User_input.nextLine();

        System.out.println(parseint(operator));
        // System.out.println(val1 'operator' val2);

    }

}
