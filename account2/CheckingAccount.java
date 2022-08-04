package account2;

public class CheckingAccount extends Account {
    private double rate;

    public CheckingAccount(double rate) {
        super(100);
        this.rate = rate;
    }

    @Override
    double rate() {
        return rate;
    }
}
