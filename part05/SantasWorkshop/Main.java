package SantasWorkshop;

public class Main {
    public static void main(String[] args) {
        Gift gift = new Gift("Puppy",5);
        System.out.println(gift.getName());
        System.out.println(gift.getWeight());
        System.out.println(gift);

        Package santaPackage = new Package();
        santaPackage.addGift(gift);
        System.out.println(santaPackage.totalWeight());

        Gift gift1 = new Gift("Kitten",2);

        santaPackage.addGift(gift1);
        System.out.println(santaPackage.totalWeight());
    }
}
