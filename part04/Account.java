public class Account {

    // fields
    private double balance;
    private String owner;

    // constructor
    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    //getters
    public String getOwner() {
        return this.owner;
    }

    public double getBalance() {
        return this.balance;
    }

    //setters
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // methods
    public void withdraw(int amount) {
        this.balance = this.balance - amount;
    }

    public void deposit(int amount) {
        this.balance = this.balance + amount;
    }

    public static void main(String[] args) {
       /* Account artosAccount = new Account("Arto's account", 100.00);
        Account artosSwissAccount = new Account("Arto's account in Switzerland", 1000000.00);

        System.out.println("Initial state");
        System.out.println(artosAccount.getBalance());
        System.out.println(artosSwissAccount.getBalance());

        artosAccount.withdraw(20);
        System.out.println("The balance of Arto's account is now: " + artosAccount.getBalance());
        artosSwissAccount.deposit(200);
        System.out.println("The balance of Arto's other account is now: " + artosSwissAccount.getBalance());

        System.out.println("End state");
        System.out.println(artosAccount.getBalance());
        System.out.println(artosSwissAccount.getBalance());*/

      /*  Account eirinsAccount = new Account("Eirin Eugenie Hagen", 100);
        System.out.println("Initial state");
        System.out.println(eirinsAccount.getOwner());
        System.out.println(eirinsAccount.getBalance());
        eirinsAccount.withdraw(50);
        System.out.println("Eirin has no money...");
        System.out.println(eirinsAccount.getBalance());*/

        Account eirinsAccount = new Account("Eirin",0);
        Account johnsAccount = new Account("John",100);
        System.out.println("Initial state of two accounts:");
        System.out.println(eirinsAccount.getOwner());
        System.out.println(eirinsAccount.getBalance());
        System.out.println(johnsAccount.getOwner());
        System.out.println(johnsAccount.getBalance());
        System.out.println("John transfer Eirin 50 kroner!");
        johnsAccount.withdraw(50);
        eirinsAccount.deposit(50);
        System.out.println("Now Eirin has 50 kroner!");
        System.out.println(eirinsAccount.getOwner());
        System.out.println(eirinsAccount.getBalance());
    }

}
