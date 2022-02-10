class Account {
    double balance;
    String accountHoldername;

    protected void debit(int amt) {
        if (amt > balance) {
            System.out.println("Debit amount exceeded account balance!");
        } else {
            balance -= amt;
            System.out.println(accountHoldername);
            System.out.println("Balance:" + balance);
        }
    }

    protected void credit(int amt) {
        balance += amt;
        System.out.println(accountHoldername);
        System.out.println("credited by:" + amt + " " + "New balance:" + balance);
    }

}

public class Bank {
    public static void main(String[] args) {
        Account person1 = new Account();
        person1.balance = 1000;
        person1.accountHoldername = "Client1";
        Account person2 = new Account();
        person2.balance = 888888;
        person2.accountHoldername = "Client2";

        person2.credit(1000);
        person2.debit(1000);
        person1.credit(1000);
        person1.debit(1000);

    }

}
