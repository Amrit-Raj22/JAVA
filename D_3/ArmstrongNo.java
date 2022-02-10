import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int val = scanner.nextInt();
        int sum = 0;

        while (val > 0) {
            int val1 = (val % 10) * (val % 10) * (val % 10);
            sum += val1;
            val /= 10;

        }
        if (sum == val) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not a armstrong");
        }

    }

}
