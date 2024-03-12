package CardPayment;

public class PaymentTerminal {
    private double money;
    private int affordableMeals;
    private int heartyMeals;

    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        if (payment >= 2.50) {
            this.money = this.money + payment;
            this.affordableMeals++;
            return payment - 2.50;
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        if (payment >= 4.30) {
            this.money = this.money + payment;
            this.heartyMeals++;
            return payment - 4.30;
        }
        return payment;
    }

    public boolean eatAffordably(PaymentCard card){
    if(card.balance() >= 2.50){
        card.takeMoney(2.50);
        this.affordableMeals++;
        return true;
    }
    return false;
    }
    public boolean eatHeartily(PaymentCard card){
    if(card.balance() >= 4.30){
        card.takeMoney(4.30);
        this.heartyMeals++;
        return true;
    }
    return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum < 0) {
            return;
        }
        card.addMoney(sum);
        this.money += sum;
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
