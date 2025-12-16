package algorithm;

public class SieveOfEratosthenes {
    private static final int MAX_NUMBER = 100;

    public static void main(String[] args) {
        boolean[] isPrime = new boolean[MAX_NUMBER + 1];

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i <= MAX_NUMBER; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= MAX_NUMBER; p++) {
            if (!isPrime[p]) {
                continue;
            }
            for (int m = p * p; m <= MAX_NUMBER; m += p) {
                isPrime[m] = false;
            }
        }

        for (int i = 2; i <= MAX_NUMBER; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}