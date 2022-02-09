import java.util.Scanner;

public class PrintValue {
    static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int m = scanner.nextInt();

        if (m == 0) {
            n = 0;
        } else if (m > 0) {
            n = 1;
        } else {
            n = -1;
        }

        System.out.println("n=" + n);
    }

}
