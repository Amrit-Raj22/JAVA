class Calculate {
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int sum = 0;

    Calculate(int a, int b) {
        this.a = a;
        this.b = b;

    }

    Calculate(int a, int b, int c) {
        this(a, b);
        this.c = c;

    }

    Calculate(int a, int b, int c, int d) {
        this(a, b, c);
        this.d = d;

    }

    void getSum() {
        sum = a + b + c + d;
        System.out.println("\nSum:" + sum);
    }

    void getValues() {
        System.out.println("a:" + a + " " + "b:" + b + " " + "c:" + c + " " + "d:" + d);
    }

    void setValues(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        System.out.println("\nValues updated!");
    }

}

public class CalculatorClass {
    public static void main(String[] args) {
        Calculate job1 = new Calculate(2, 3);
        Calculate job2 = new Calculate(2, 3, 4);
        Calculate job3 = new Calculate(2, 3, 4, 5);

        job1.getSum();
        job2.getSum();
        job3.getSum();

        // job1.setValues(1, 1, 1, 1);
        // job2.setValues(1, 1, 1, 1);
        // job3.setValues(1, 1, 1, 1);

        job1.getValues();
        job2.getValues();
        job3.getValues();

        job1.getSum();
        job2.getSum();
        job3.getSum();
    }

}
