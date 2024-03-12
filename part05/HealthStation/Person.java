package HealthStation;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void printPerson() {
        System.out.println("My name is " + this.name + " and I am " + this.age + " years old");
    }

    public void growOlder() {
        this.age++;
    }

    public boolean isOfLegalAge() {
        if (this.age > 17) {
            return true;
        }

        return false;
    }

    public double bmi() {
        double heightInMeters = this.height / 100.0;

        return this.weight / (heightInMeters * heightInMeters);
    }


}
