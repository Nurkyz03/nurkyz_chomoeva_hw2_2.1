public class BankAccount {
    private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            amount += sum;
        }
    }

    public void withDraw (int sum) throws LimitExpection {
        if (sum > amount) {
            throw new LimitExpection("Недостаточно средств на счету: ", amount);
        }
        amount -= sum;
    }
}
