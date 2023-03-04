package project_euler;

import java.util.ArrayList;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

public class euler_3 {
    public static void main(String[] args) {
        long number = 600851475143L;
        ArrayList<Long> dividers = new ArrayList<>();

        long sDivider = getSmallestPrimeFactor(number);
        if (sDivider == number) {
            System.out.println(number);
            return;
        }
        dividers.add(sDivider);
        while (sDivider != number) {
            number = number / sDivider;
            sDivider = getSmallestPrimeFactor(number);
            dividers.add(sDivider);
        }

        System.out.println(getMax(dividers));
    }

    private static long getSmallestPrimeFactor(long n) {
        if (n < 0)
            return -1;
        long k = 1;
        while (k < n) {
            k++;
            if (n % k == 0 && isPrime(k))
                break;
        }
        return k;
    }

    private static boolean isPrime(long n) {
        for (long k = 2; k <= Math.floor(Math.sqrt(n)); k++) {
            if (n % k == 0)
                return false;
        }
        return true;
    }

    private static long getMax(ArrayList<Long> list) {
        if (list.size() < 1)
            return -1;
        long max = 1;
        for (long n: list) {
            if (n > max)
                max = n;
        }
        return max;
    }
}
