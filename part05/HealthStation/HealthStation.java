package HealthStation;

public class HealthStation {
    private int numberOFWeighnings;

    public HealthStation() {
        this.numberOFWeighnings = 0;
    }


    public int weigh(Person person) {
        this.numberOFWeighnings++;  // RETURN THE LAST
        return person.getWeight();

    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        return this.numberOFWeighnings;
    }
}
