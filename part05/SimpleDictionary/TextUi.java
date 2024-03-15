package SimpleDictionary;

import java.util.Scanner;

public class TextUi {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUi(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;  // maybe because we do not making objects here and making them as a parameter
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;

            } else if (command.equals("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                simpleDictionary.add(word, translation);

            } else if (command.equals("search")) {
                System.out.println("To be translated:  ");
                String returnedTranslation = scanner.nextLine();
                if (simpleDictionary.translate(returnedTranslation) == null) {
                    System.out.println("Word was not found!");
                } else {
                    System.out.println("Translation :" + simpleDictionary.translate(returnedTranslation));
                }
            } else {
                System.out.println("Unknown command!");
            }
        }
    }
}
