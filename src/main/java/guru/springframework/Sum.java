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
        int amount = augmend.amount + addmend.amount;
        return new Money(amount, to);
    }
}
