
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account Matthewsaccount = new Account("Matthews account", 1000.00);
        Account Myaccount = new Account("My account", 0.00);
        Matthewsaccount.withdrawal(100);
        Myaccount.deposit(100);
        System.out.println(Matthewsaccount);
        System.out.println(Myaccount);
        // Do not touch the code in Account.java
        // write your program here
    }
}
