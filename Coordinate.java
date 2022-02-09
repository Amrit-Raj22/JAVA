import java.util.Scanner;

public class Coordinate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coordinates X AND Y:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println((x > 0) ? (y > 0) ? "First Quadrant" : "Fourth Quadrant"
                : (y > 0) ? "Second Quadrant" : "Third Quadrant");
        System.out.println(x + " " + y);

    }

}
