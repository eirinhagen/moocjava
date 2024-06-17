package DictionaryOfManyTranslations;

public class Main {
    public static void main(String[] args) {
        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
        dictionary.add("gjedde", "hauki");
        dictionary.add("gjedde", "kisya");
        System.out.println(dictionary.translate("gjedde"));

    }
}
