import java.util.Scanner;

public class Film {

    //fields
    private String name;
    private int ageRating;

    //constructor
    public Film(String name, int ageRating){
        this.name = name;
        this.ageRating = ageRating;
    }

    // methods

    public String getName() {
        return this.name;
    }

    public int getAgeRating() {
        return this.ageRating;
    }

    public static void main(String[] args) {
        Film film1 = new Film("The Endless",16);
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int input = Integer.parseInt(scanner.nextLine());
        if (input >= film1.getAgeRating()){
            System.out.println("You can watch movie "+film1.getName());
        }else {
            System.out.println("You cannot watch movie "+ film1.getName());
        }
    }
}
