public class Product {
     private String name;
     private int quantity;
     private double price;

    public Product(String initialName,double initialPrice, int initialQuantity){
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }

    public void printProduct(){
        System.out.println(this.name+",price "+this.price+","+this.quantity+" pcs");
    }

    public static void main(String[] args) {
        Product product1 = new Product("Book",200.0,4);
        product1.printProduct();
    }
}
