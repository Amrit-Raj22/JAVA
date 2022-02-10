protected class Account {
    float balance;
    String accountHoldername;

}

public class Bank {
    public static void main(String[] args) {
        Account person1 = new Account();
        person1.balance = 1000;
        person1.accountHoldername = "Client1";
        Account person2 = new Account();
        person2.balance = 888888;
        person2.accountHoldername = "Client2";

    }

}
