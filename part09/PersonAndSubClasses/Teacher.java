package PersonAndSubClasses;

public class Teacher extends Person {
    private int salary;
    public Teacher(String name, String address,int salary){
       super(name,address);
       this.salary = salary;
    }
    public int salary(){
        return salary;
    }
    public String toString(){
        return this.getName() + "\n"+ this.getAddress() + "\n"+ this.salary()+" kroner";
    }

}
