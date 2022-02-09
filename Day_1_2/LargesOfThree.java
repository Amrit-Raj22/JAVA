import java.util.Scanner;

public class LargesOfThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 NO.s");
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();
        int val3 = scanner.nextInt();

        int result = (val1 > val2) ? (val1 > val3) ? val1 : val3 : (val2 > val3) ? val2 : val3;
        System.out.println(result);

    }
}
