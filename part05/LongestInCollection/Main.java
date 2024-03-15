package LongestInCollection;

public class Main {
    public static void main(String[] args) {
        SimpleCollection collection = new SimpleCollection("characters");
        collection.add("Kino");
        collection.add("Guts");
        System.out.println(collection.longest());
    }

}
