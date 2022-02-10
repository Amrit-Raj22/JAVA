public class PrintNSum {
    static int sum = 0;

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println(sum);
        }

        System.out.println("sum till 100 -----------");
        sum = 0;
        for (int i = 0; sum <= 100; i++) {

            sum += i;
            System.out.println(sum);

        }
    }

}
