public class LimitExpection extends Exception{
    private double remainingAmount;

    public LimitExpection(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }
}
