package PersonalInformation;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<PersonalInformation> people = new ArrayList<>();

        while (true) {
            System.out.println("First name: ");
            String first = scanner.nextLine();
            if(first.isEmpty()){
                break;
            }
            System.out.println("Last name: ");
            String last = scanner.nextLine();
            System.out.println("Identification number:");
            String identification = scanner.nextLine();
            people.add(new PersonalInformation(first, last, identification));
        }

        for (PersonalInformation person : people) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }

    }
}
