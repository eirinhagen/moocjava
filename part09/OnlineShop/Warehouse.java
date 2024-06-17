package OnlineShop;

import java.util.*;

public class Warehouse {

    Map<String, Integer> productPrice;
    Map<String, Integer> productStock;

    public Warehouse() {
        this.productPrice = new HashMap<>();
        this.productStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.productPrice.put(product, price);
        this.productStock.put(product, stock);
    }

    public int price(String product) {
        if (this.productPrice.containsKey(product)) {
            return this.productPrice.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (this.productStock.containsKey(product)) {
            return this.productStock.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (this.productStock.containsKey(product) && this.productStock.get(product) > 0) {
            int currentStock = this.productStock.get(product);
            this.productStock.put(product, currentStock - 1);
        }
        return false;
    }

    public Set<String> products(){
        Set<String> productsSet = new HashSet<>();
        for (String product : productStock.keySet()){
            productsSet.add(product);
        }
        return productsSet;
    }
}
