import java.util.Scanner;

public class InputSpecifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (scanner.next().charAt(0) != 'q') {
            count++;
        }
        System.out.println(count);
        scanner.close();

    }

}
