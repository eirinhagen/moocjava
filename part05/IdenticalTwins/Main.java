package IdenticalTwins;

public class Main {
    public static void main(String[] args) {
        SimpleDate eirinsDay = new SimpleDate(13,02,1998);
        SimpleDate johnsDay = new SimpleDate(24,01,1992);

        Person eirin = new Person("Eirin Hagen",eirinsDay,162,58);
        Person john = new Person("John Hagen", johnsDay,182,85);

        System.out.println(eirin);
        System.out.println(john);

        System.out.println(eirin.equals(eirin));
    }
}
