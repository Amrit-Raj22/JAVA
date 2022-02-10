import java.util.Scanner;

public class CheckForPrime2 {

    public static boolean isPrime(int val) {
        for (int i = 2; i < val; i++) {
            if (val % i == 0) {
                return false;

            }
        }
        return true;

    }

    public static boolean isArmstrong(int val) {
        int val1 = val;
        int sum = 0;
        int count = 0;
        while (val1 > 0) {
            count++;
            val1 /= 10;
        }
        val1 = val;
        while (val > 0) {
            int rem = val % 10;
            sum += Math.pow(rem, count);
            val /= 10;

        }
        return sum == val1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER NO");
        int val = scanner.nextInt();
        for (int i = 1; i <= val; i++) {
            if (isPrime(i)) {
                System.out.println("Prime:" + i);
            } else if (isArmstrong(i)) {
                System.out.println("Armstrong:" + i);

            } else {
                System.out.println("Default:" + i);
            }
        }
        scanner.close();

    }
}
