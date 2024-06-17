package SimpleDictionary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TextUi test = new TextUi(new Scanner(System.in),new SimpleDictionary());
        test.start();
    }
}
