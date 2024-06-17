package PersonAndSubClasses;

import java.util.ArrayList;

public class Program {
    public static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    public static void main(String[] args) {
       /* Student eirin = new Student("Eirin ", "Mostubben 27");
        eirin.study();
        eirin.study();
        System.out.println(eirin);
        Teacher rolando = new Teacher("Rolando", "Unknown", 50000);
        System.out.println(rolando);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(persons);*/
        Student eirin = new Student("Eirin ", "Mostubben 27");
        System.out.println(eirin);
        Person eirin1 = new Student("Eirin","Mostubben 27");
        System.out.println(eirin1);


    }
}

