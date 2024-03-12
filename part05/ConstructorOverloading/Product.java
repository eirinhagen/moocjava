package ConstructorOverloading;

public class Product {
    private String name;
    private String location;
    private double weight;

    public String getName(){
        return  this.name;
    }

    public String getLocation(){
        return this.location;
    }

    public double getWeight() {
        return this.weight;
    }

    public Product(String name, String location, double weight){
        this.name = name;
        this.location = location;
        this.weight = weight;
    }

    public Product(String name){
        this(name,"Shelf",1.0);
    }

    public Product(String name,String location){
        this(name,location,1.0);
    }

    public Product(String name,double weight){
        this(name,"Shelf",weight);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", weight=" + weight +
                '}';
    }
}
