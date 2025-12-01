package algorithm;

public class FizzBuzz {
    private static final int FIZZ = 3;
    private static final int BUZZ = 5;
    private static final int MAX_NUM = 100;

    public static void main(String[] args) {
        for (int i = 1; i <= MAX_NUM; i++) {
            if (i % (FIZZ * BUZZ) == 0) {
                System.out.println("FizzBuzz");
            } else if (i % FIZZ == 0) {
                System.out.println("Fizz");
            } else if (i % BUZZ == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}