public class PrimeNo {
    static int i;

    public static void main(String[] args) {
        int val = 23;

        for (i = 2; i < 23; i++) {
            if (val % i == 0) {
                System.out.println("Not Prime");
                break;
            }

        }

        if (i == 23) {
            System.out.println("Prime");
        }

    }

}
