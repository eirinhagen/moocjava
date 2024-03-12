public class Debt {

    //fields
    private double balance;
    private double interestRate;


    //constructor
    public Debt(double initialBalance,double initialInterestRate){
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }

    //methods

    public void printBalance(){
        System.out.println(this.balance);
    }

    public void waitOneYear(){
        this.balance = this.balance * this.interestRate;
    }

    public static void main(String[] args) {
        Debt mortgage = new Debt(120000.0,1.20);
        mortgage.printBalance();
        mortgage.waitOneYear();
        mortgage.printBalance();

        int years = 0;
        while (years < 20){
            mortgage.waitOneYear();
            years++;
        }
        mortgage.printBalance();
    }

}
