package OnlineShop;

import java.util.Objects;

public class Item {
    private String product;
    private int qty;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int price() {
        int price = this.qty * this.unitPrice;
        return price;
    }

    public void increaseQuantity(){
        this.qty += 1;
    }

    @Override
    public String toString() {
       return this.product + " "+ this.qty;
    }

    public String getProduct() {
        return product;
    }

    public int getQty() {
        return qty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(product, item.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product);
    }
}
