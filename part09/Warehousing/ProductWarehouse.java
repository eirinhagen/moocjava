package Warehousing;

public class ProductWarehouse extends Warehouse {
    private String productName;

    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }

    public String getName() {
        return this.productName;
    }

    public void setProductName(String newName) {
        this.productName = newName;
    }

    public String toString() {
        return this.getName() + ": " + super.toString();
    }


}
