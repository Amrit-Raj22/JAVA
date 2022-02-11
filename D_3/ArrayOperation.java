import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperation {
    public static void main(String[] args) {
        int[] values = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < values.length; i++) {
            values[i] = 0;
        }
        System.out.println("Enter 10 Values:");
        for (int i = 0; i < 10; i++) {
            values[i] = scanner.nextInt();

        }
        scanner.close();

        for (int i = 0; i < 10; i++) {
            values[i] += 1;
        }

        Arrays.sort(values);
        System.out.println("Top 5 values:");
        for (int i = values.length - 1; i > values.length - 6; i--) {
            System.out.println(values[i]);
        }
    }

}
