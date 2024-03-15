package SantasWorkshop;

public class Gift {

    //fields
    private String name;
    private int weight;

    //constructor
    public Gift(String name,int weight){
        this.name = name;
        this.weight = weight;
    }
    // getters
    public String getName(){
        return this.name;
    }

    public int getWeight(){
        return this.weight;
    }

    //toString
    public String toString(){
        return  this.name+"("+this.weight+" kg)";
    }
}
