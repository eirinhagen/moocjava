package CargoHold;

import java.util.ArrayList;

public class Suitcase {
    private int maximumWeight;
    private ArrayList<Item> items;

    public Suitcase(int maximumWeight){
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void printItems(){
        for(Item item : items){
            System.out.println(item);
        }
    }

    public int totalWeight(){
        int totalWeight = 0;
        for(Item item : items){
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem(){
        if(items.isEmpty())
            return null;
        Item returnedObject = items.get(0);
        for(Item item : items){
            if(returnedObject.getWeight()< item.getWeight()){
                returnedObject = item;
            }
        }
        return returnedObject;
    }


    public String toString(){
        if(this.items.isEmpty()){
            return "no items (0kg)";
        }
        if (this.items.size() == 1){
            return this.items.size()+ " item ( "+ this.items.getFirst().getWeight()+" kg)";
        }
        return this.items.size()+" items ("+this.totalWeight()+" kg)";
    }
}
