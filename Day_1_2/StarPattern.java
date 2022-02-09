import java.util.Scanner;

public class StarPattern {
    static int i;
    static int j;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (i = 0; i < num; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }

}
