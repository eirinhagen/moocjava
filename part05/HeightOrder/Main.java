package HeightOrder;

public class Main {
    public static void main(String[] args) {
        Room entre = new Room();
        Person eirin = new Person("Eirin", 162);
        Person john = new Person("John", 184);
        entre.add(eirin);
        System.out.println(entre.getPersons());
        entre.add(john);
        System.out.println(entre.getPersons());
        System.out.println(entre.isEmpty());
   /*     entre.goOutFromRoom();
        System.out.println(entre.isEmpty());*/
 /*       System.out.println(entre.shortest());
        System.out.println(entre.getPersons());*/
        System.out.println(entre.getPersons());
        System.out.println(entre.take());
        System.out.println(entre.getPersons());
    }
}
