package PrintMeAnotherHashMap;

import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        Book first = new Book("first",1955);
        Book second = new Book("second",1995);

        HashMap<String,Book> hashMap = new HashMap<>();
        hashMap.put("First",first);
        hashMap.put("Second",second);

        System.out.println(hashMap.get("First"));
        System.out.println(hashMap.get("Second"));
        System.out.println("");


        printValues(hashMap);
        System.out.println("");

        printValueIfNameContains(hashMap,"st");
        printValueIfNameContains(hashMap,"on");

    }

    public static void printValues(HashMap<String,Book> hashMap){
        for (String key : hashMap.keySet()){
            System.out.println(hashMap.get(key).toString());
        }
    }

    public static void printValueIfNameContains(HashMap<String,Book> hashMap,String text){
        for(String key : hashMap.keySet()){
            if (hashMap.get(key).getName().contains(text)){
                System.out.println(hashMap.get(key).getName());
            }
        }
    }
}
