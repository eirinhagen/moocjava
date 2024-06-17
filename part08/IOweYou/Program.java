package IOweYou;

public class Program {
    public static void main(String[] args) {
        IOU eirinsIOU = new IOU();
        eirinsIOU.setSum("John", 150.0);
        System.out.println(eirinsIOU.debts);
        System.out.println("");
        System.out.println(eirinsIOU.howMuchIOweYTo("John"));
    }
}
