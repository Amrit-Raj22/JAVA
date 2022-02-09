import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values:");

        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();

        int i = (val1 > val2) ? val1 : val2;

        while (true) {
            if (i % val1 == 0 && i % val2 == 0) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }

}
