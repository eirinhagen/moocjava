package PrintMeHashMap;


import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("Kot","Fenya");
        hashMap.put("Sobaka","Gryzlo");
        hashMap.put("Bober","Grisha");

        System.out.println(hashMap.get("Bober"));
        System.out.println("");
        System.out.println(hashMap.keySet());
        System.out.println("");
        printKeys(hashMap);
        System.out.println("");
        printKeysWhere(hashMap,"Bo");
        System.out.println("");
        printValuesOfKeysWhere(hashMap,"o");
        System.out.println("");
        printValuesOfKeysWhere(hashMap,"t");
    }
    public static void printKeys(HashMap<String,String> hashMap){
        for (String key : hashMap.keySet()){
            System.out.println(key);
        }
    }
    public static void printKeysWhere(HashMap<String,String> hashMap,String text){
        for (String key : hashMap.keySet()){
            if(key.contains(text)){
                System.out.println(key);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String,String> hashMap, String text){
       for (String key : hashMap.keySet()){
           if (key.contains(text)){
               System.out.println(hashMap.get(key));
           }
       }
    }
}
