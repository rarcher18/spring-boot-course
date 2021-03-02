package guru.springframework;

public class Sum implements Expression {
    Money augmend;
    Money addmend;
    private Sum sum;

    public Sum(Money augmend, Money addmend) {
        this.augmend = augmend;
        this.addmend = addmend;
    }

    public Money reduce(String to){
        int amount = sum.augmend.amount + sum.addmend.amount;
        return new Money(amount, to);
    }
}
