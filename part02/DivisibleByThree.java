public class DivisibleByThree {
    public static void main(String[] args) {
        divisibleByThree(3, 89);
    }

    public static void divisibleByThree(int beginning, int ending) {
        for (int i = 0; i <= ending - beginning; i++) {
            if ((beginning + i) % 3 == 0) {
                System.out.println(beginning + i);
            }
        }
    }
}
