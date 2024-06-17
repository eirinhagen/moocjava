package Abbreviations;

import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviations;

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    public static String sanitizedString(String string) {
        if (string == null) {
            return "";
        }
        string = string.toLowerCase();
        return string.trim();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        String newAbbreviation= sanitizedString(abbreviation);
        String newExplanation = sanitizedString(explanation);
        this.abbreviations.put(newAbbreviation,newExplanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        String newAbbreviation = sanitizedString(abbreviation);
        if (this.abbreviations.containsKey(newAbbreviation)){
            System.out.println("Abbreviation is already on list!");
            return true;
        } else {
            System.out.println("Abbreviation is not on list!");
            return false;
        }
    }

    public String findExplanation(String abbreviation) {
        String newAbbreviation = sanitizedString(abbreviation);
        if (this.abbreviations.containsKey(newAbbreviation)) {
            return this.abbreviations.get(newAbbreviation);
        } else {
            System.out.println("Abbreviation is not on the list");
            return null;
        }
    }

}
