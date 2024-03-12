package DatingApp;

public class Main {
    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(1, 1, 2000);
        System.out.println(date);
        System.out.println(date.afterNumberOfDays(365));
    }


}
