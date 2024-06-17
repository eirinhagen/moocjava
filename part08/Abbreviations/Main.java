package Abbreviations;

public class Main {
    public static void main(String[] args) {
        Abbreviations list = new Abbreviations();
        list.addAbbreviation("Pit","bul");
        System.out.println(list.findExplanation("Pit"));
        list.hasAbbreviation("    pit");
        System.out.println(list.findExplanation("pit    "));
    }
}
