import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        System.out.println(
                (year % 4 == 0) ? (year % 100 == 0) ? (year % 400 == 0) ? "leap year" : "not a leap year" : "leap year"
                        : "not a leap year");

    }

}
