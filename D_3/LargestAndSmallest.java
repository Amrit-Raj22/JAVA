import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("entr elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int minC = arr[0];
        int maxC = arr[0];
        for (int i = 1; i < n; i++) {
            if (minC > arr[i]) {
                minC = arr[i];
            }
            if (maxC < arr[i]) {
                maxC = arr[i];
            }

        }
        System.out.println(minC + " " + maxC);
        scanner.close();
    }

}
