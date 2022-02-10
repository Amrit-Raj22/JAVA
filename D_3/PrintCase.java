import java.util.Scanner;

public class PrintCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char line = scanner.next().charAt(0);

        if (line >= 'A' && line <= 'Z') {
            System.out.println("Upper case");

        } else if (line >= 'a' && line <= 'z') {
            System.out.println("Lower case");
        } else if (line >= '0' && line <= '9') {
            System.out.println("Integer");

        } else {
            System.out.println("Default value");
        }

    }
    /*
     * String line=scanner.nextLine();
     * for(int i=0;i<line.length();i++) {
     * int ch=codePointAt(i);
     * if (ch >= 65 && ch<= 90) {
     * System.out.println("Upper case");
     * 
     * } else if (ch>= 97 && ch<=122) {
     * System.out.println("Lower case");
     * } else if (line >= '0' && line <= '9') {
     * System.out.println("Integer");
     * 
     * } else {
     * System.out.println("Default value");
     * }
     * }
     * 
     */

}
