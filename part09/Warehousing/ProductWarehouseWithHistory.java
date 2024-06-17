package Warehousing;

public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory changeHistory;
    private double initialBalance;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.changeHistory = new ChangeHistory();
        this.initialBalance = initialBalance;
        this.addToWarehouse(initialBalance);
        this.changeHistory.add(initialBalance);
    }

    public String history() {
        return this.changeHistory.toString();
    }

    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        changeHistory.add(super.getBalance());
    }
    public double takeFromWarehouse(double amount){
        if (super.getBalance() < amount) {
            this.changeHistory.add(super.getBalance());
            return super.getBalance();
        }
        super.takeFromWarehouse(amount);
        changeHistory.add(super.getBalance());
        return super.getBalance();

    }
    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + this.changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + this.changeHistory.minValue());
        System.out.println("Average: " + this.changeHistory.average());
    }

}
