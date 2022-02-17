import java.util.Scanner;

interface int1 {
    int display(int p);
}

class PrimeNo implements int1 {
    boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public int display(int k) {
        int count = 0;
        for (int i = 2; i <= k; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }
}

public class Interface1 {
    public static void main(String[] args) {
        int1 n = new PrimeNo();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++)
            arr[i] = n.display(sc.nextInt());
        for (int i = 0; i < num; i++)
            System.out.println(arr[i]);
        sc.close();
    }

}
