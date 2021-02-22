package guru.springframework;

public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
    }

    @Override
    protected String currency() {
        return "CHF";
    }

    public Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
