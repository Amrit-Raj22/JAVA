import java.util.Scanner;

public class ExtractDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();

        while (val > 0) {
            System.out.println(val % 10);
            val /= 10;
        }
        scanner.close();
    }

}
