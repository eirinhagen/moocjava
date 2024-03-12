public class Gauge {
    //fields
    private int value;

    //constructor
    public Gauge() {
        this.value = 0;
    }
//methods
    public void increase() {
        if (value < 5) {
            this.value = this.value + 1;
        }
    }

    public void decrease() {
        if (value > 0) {
            this.value = this.value - 1;
        }
    }

    public int getValue(){
        return this.value;
    }

    public boolean full(){
        return this.value == 5;
    }

    public static void main(String[] args) {
        Gauge g = new Gauge();
        while (!g.full()){
            System.out.println("Not full! Value:"+g.getValue());
            g.increase();
        }

        System.out.println("Full! Value: " + g.getValue());
        g.decrease();
        System.out.println("Not full! Value: " + g.getValue());
    }
}

