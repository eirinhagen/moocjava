package JokeManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JokeManager jokeManager = new JokeManager();
        UserInterface test = new UserInterface(jokeManager,scanner);
        test.start();
    }
}
