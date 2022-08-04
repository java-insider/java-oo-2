package account2;

public abstract class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void updateBalance() {
        balance += balance * rate();
    }

    abstract double rate();
}
