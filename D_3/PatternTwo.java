public class PatternTwo {
    static int i;

    public static void main(String[] args) {
        int k=0;
        for (i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
            for (int j = 0; j < 7 - k; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            k = k + 2;
            }

        }
    }
}
