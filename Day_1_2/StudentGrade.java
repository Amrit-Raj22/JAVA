import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER subject marks");
        int math = scanner.nextInt();
        int phy = scanner.nextInt();
        int chem = scanner.nextInt();

        int avg = (math + phy + chem) / 3;

        if (avg >= 90) {
            System.out.print("A");
        } else if (avg >= 60 && avg < 80) {
            System.out.print("B");
        } else if (avg >= 40 && avg < 60) {
            System.out.print("C");
        } else {
            System.out.print("F");
        }
    }

}
