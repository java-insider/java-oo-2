package account2;

public class ExAccount {

    public static void main(String[] args) {

        CheckingAccount a1 = new CheckingAccount(0.01);
        System.out.println(a1.getBalance());
        a1.updateBalance();
        a1.updateBalance();
        System.out.println(a1.getBalance());

        System.out.println("-------------");

        SavingsAccount a2 = new SavingsAccount(100);
        System.out.println(a2.getBalance());
        a2.updateBalance();
        a2.updateBalance();
        System.out.println(a2.getBalance());
    }
}
