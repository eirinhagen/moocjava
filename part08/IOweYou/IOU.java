package IOweYou;

import java.util.HashMap;

public class IOU {
    HashMap<String,Double> debts;
    public IOU(){
        this.debts = new HashMap<>();
    }

    public void setSum(String toWhom,double amount){
        this.debts.put(toWhom,amount);
    }
    public double howMuchIOweYTo(String toWhom){
       return this.debts.getOrDefault(toWhom,0.0);
    }

}
