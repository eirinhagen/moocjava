package CargoHold;

import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> onHold;

    public Hold( int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.onHold = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase){
        onHold.add(suitcase);
    }

    public int totalWeight(){
        int totalWeight = 0;
        for(Suitcase suitcase : onHold){
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }

    public void printItems(){
        for(Suitcase suitcase : onHold){
            suitcase.printItems();
        }
    }
    public String toString(){  if(this.onHold.isEmpty()){
        return "no suitcases (0kg)";
    }
        if (this.onHold.size() == 1){
            return this.onHold.size()+ " item ( "+ this.onHold.getFirst().totalWeight()+" kg)";
        }
        return this.onHold.size()+" items ("+this.totalWeight()+" kg)";
    }
}
