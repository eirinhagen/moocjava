package OnlineShop;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void add(String product, int price) {
        Item item = new Item(product, 1, price);

        for (Item it : cart.values()) {
            if (it.equals(item)) {
                it.increaseQuantity();
                return;
            }
        }
        cart.put(product, item);

    }

    public int price() {
        int totalPrice = 0;
        for (Item item : this.cart.values()) {
            totalPrice += item.price();
        }
        return totalPrice;
    }

    public void print() {
        for (Item item : cart.values()) {
            System.out.println(item.getProduct() + ": " + item.getQty());
        }
    }

}
