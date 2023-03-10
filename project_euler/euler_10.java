package project_euler;

import java.util.ArrayList;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * <p>
 * Find the sum of all the primes below two million.
 */

public class euler_10 {
    public static void main(String[] args) {
        int n = 2000000;

        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);

        int start = primes.get(primes.size() - 1) + 2;

        mainloop:
        for (int i = start; i < n; i += 2) {
            for (int prime: primes) {
                if (prime > Math.sqrt(primes.get(primes.size() - 1)) + 1) {
                    break;
                }
                if (i % prime == 0)
                    continue mainloop;
            }
            primes.add(i);
        }

        long sum = 0;
        for (int prime: primes) {
            sum = sum + prime;
        }
        System.out.println(sum);
    }
}
