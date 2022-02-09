public class Functions {
    protected static int Square(int x) {
        return x * x;
    }

    protected static void Swap(int a, int b) {
        System.out.println("Before swaping:a=" + a + " " + "b=" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swaping:a=" + a + " " + "b=" + b);
    }

    protected static void Details(String Name, String City, String Hobby) {
        System.out.println("Name:" + Name + "\nCity:" + City + "\nHobby:" + Hobby);

    }

    protected static boolean CheckEven(int x) {
        if (x % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int val1 = 13;
        int val2 = 10;

        System.out.println("number=" + val1 + ", square=" + Square(val1));
        Details("Amrit", "Ghaziabad", "R & D");
        Swap(val1, val2);
        System.out.println("integer:" + val1 + " " + "is even ?:" + CheckEven(val1));

    }
}
