package SantasWorkshop;

import java.util.ArrayList;

public class Package {
    //fields
    private ArrayList<Gift> gifts; // you do not need to assign variable to new ArrayList!

    //constructor
    public Package(){
        this.gifts = new ArrayList<>();
    }

    //methods
    public void addGift(Gift gift){
        gifts.add(gift);
    }

    public int totalWeight(){
        if(gifts.isEmpty()){
            return -1;
        }
        int totalWeight = 0;
        for (Gift gift : gifts) {
            totalWeight +=  gift.getWeight();
        }
        return totalWeight;
    }

}
