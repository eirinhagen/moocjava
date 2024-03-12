public class Song {
    private String name;
    private int length;

    public Song(String name, int length){
        this.name = name;
        this.length = length;
    }

    public String name(){
        return this.name;
    }

    public  int length(){
        return this.length;
    }

    public static void main(String[] args) {
        Song musicIsMath = new Song("Music Is Math",300);
        System.out.println("The song "+musicIsMath.name()+" has length "+ musicIsMath.length()+" seconds!");
    }
}
