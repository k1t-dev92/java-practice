package algorithm;

public class PrimeNumbers {
    private static final int MAX_NUMBER = 100;

    public static void main(String[] args) {
        for (int i = 2; i <= MAX_NUMBER; i++) {
            boolean isPrime = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}