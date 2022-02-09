import java.util.Scanner;

public class HCF {
    static int hcf;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter values:");
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();

        int i = 1;
        for (; i < val1 && i < val2; i++) {
            if (val1 % i == 0 && val2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println(hcf);
        scanner.close();
    }

}
