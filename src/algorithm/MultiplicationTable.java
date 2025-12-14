package algorithm;

public class MultiplicationTable {
    private static final int MAX_FACTOR = 9;

    public static void main(String[] args) {
        for (int i = 1; i <= MAX_FACTOR; i++) {
            for (int j = 1; j <= MAX_FACTOR; j++) {
                System.out.printf("%2d ", i * j);
            }
            System.out.println();
        }
    }
}